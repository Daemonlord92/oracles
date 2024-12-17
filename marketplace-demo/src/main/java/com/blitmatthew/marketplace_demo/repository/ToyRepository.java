package com.blitmatthew.marketplace_demo.repository;

import com.blitmatthew.marketplace_demo.entity.Toy;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface ToyRepository extends ListCrudRepository<Toy, Long> {
    Optional<Toy> findByName(String name);
}
