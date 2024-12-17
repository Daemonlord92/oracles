package com.blitmatthew.marketplace_demo.service;

import com.blitmatthew.marketplace_demo.entity.Toy;
import com.blitmatthew.marketplace_demo.repository.ToyRepository;
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
}
