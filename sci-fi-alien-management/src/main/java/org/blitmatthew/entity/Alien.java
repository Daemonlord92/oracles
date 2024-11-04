package org.blitmatthew.entity;

public class Alien {
    private Long id;
    private String name;
    private String species;
    private Double weight;
    private Double height;

    public Alien() {}

    public Alien(Long id, String name, String species, Double weight, Double height) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.height = height;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Alie n {" +
                "id= " + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
