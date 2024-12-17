package com.blitmatthew.marketplace_demo.service;

import com.blitmatthew.marketplace_demo.entity.Toy;

import java.util.List;

public interface ToyService {
    List<Toy> getToys();
    void saveToy(Toy toy);
}
