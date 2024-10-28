package org.blitmatthew;

public class Animal {
    // String is a class
    private String name;
    private String species;
    //double is a primitive type
    //different primitive types
    // numbers
    // byte, short, int, long, float, double
    // boolean
    // char
    // primitive are store on to the stack memory
    // while class data types like String are stored in the heap memory with it memory address being store
    // in the stack.
    private double height;
    private double weight;

    private static int animalCount = 0;

    // Empty Constructor
    // If a class is made without any constructor Java will give it a default empty constructor
    // to be used.
    public Animal() {
        animalCount++;
    }

    //Parameterized Constructor
    // Allows you to create the object at creation to set the field variables
    public Animal(String name, String species, double height, double weight) {
        //the "this" keyword will reference the object being created from the class
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animal.animalCount = animalCount;
    }

    // Getter Methods
    // Getter methods are standard to retrieve field variables out of the object
    public String getName() {
        return name;
    }

    // Setter Methods
    // Setter Methods are used to change the field inside an object
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
