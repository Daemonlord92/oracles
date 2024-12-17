package com.blitmatthew.marketplace_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Size(min = 3, max = 25, message = "Most colors are between 3 -25 characters long")
    @NotNull(message = "Color field has to be filled out")
    private String color;
    @Min(value = 1l, message = "Toy has to be a size 1 or greater")
    @Max(value = 8l, message = "Toy above size 8 are to dangerous to sell")
    @NotNull(message = "Size field has to be filled out")
    private Double size;
    @Size(min = 25, max = 255)
    @NotNull
    private String description;
    @Size(min = 3, max = 50)
    @NotNull
    private String name;

    public Toy() {
    }

    public Toy(String color, Double size, String description, String name) {
        this.color = color;
        this.size = size;
        this.description = description;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
