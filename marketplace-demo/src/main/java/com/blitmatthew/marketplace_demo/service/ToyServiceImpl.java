package com.blitmatthew.marketplace_demo.service;

import com.blitmatthew.marketplace_demo.entity.Toy;
import com.blitmatthew.marketplace_demo.repository.ToyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToyServiceImpl implements ToyService{

    private final ToyRepository toyRepository;

    public ToyServiceImpl(ToyRepository toyRepository) {
        this.toyRepository = toyRepository;
    }

    @Override
    public List<Toy> getToys() {
        return toyRepository.findAll();
    }

    @Override
    public void saveToy(Toy toy) {
        toyRepository.save(toy);
    }

    @Override
    public Toy getToyById(Long id) {
        return toyRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Toy with the id " + id + " not found!"));
    }

    @Override
    public void updateToy(Toy toy) {
        Toy oldToyObject = getToyById(toy.getId());
        toyRepository.save(toy);
    }

    @Override
    public void deleteToyById(Long id) {
        if(toyRepository.existsById(id)){
            toyRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Toy with the id " + id + " does not exists");
        }
    }
}
