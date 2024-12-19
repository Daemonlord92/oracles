package com.blitmatthew.marketplace_demo.service;

import com.blitmatthew.marketplace_demo.entity.Toy;

import java.util.List;

public interface ToyService {
    List<Toy> getToys();
    void saveToy(Toy toy);
    Toy getToyById(Long id);
    void updateToy(Toy toy);
    void deleteToyById(Long id);
}
