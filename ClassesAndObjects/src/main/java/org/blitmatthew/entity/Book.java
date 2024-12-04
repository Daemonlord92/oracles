package org.blitmatthew.entity;

import java.io.Serializable;

public class Book implements Serializable {
    //Access Modifiers
    //public, private, protected, default(private-protected)
    //public access modifier
    //Anyone can access it
    //private access modifier
    //Only in the class is it accessible
    //protected access modifier
    //the same package or children
    //default access modifier
    // only accessible within the same package
    //Java Bean
    //private field variables
    //Constructors
    //Getter and Setters
    //implement the Serializable interface
    private String title;
    private String author;
    private int noOfPages;
    private String isbn;

    //What is the constructor
    //is a special so we create an object out of the class
    //if the constructor is not provided
    // Java will supply an empty constructor as default
    // empty constructor
    // new object, no values stored in the object
    // parameterized constructor
    // new object, but will set the values upon creation
    //This is the default empty constructor
    public Book() {}
    //the parameterized constructor
    public Book(String title, String author, int noOfPages, String isbn) {
        //the use of the "this" keyword we are making reference to the object being created
        this.title = title;
        this.author = author;
        this.noOfPages = noOfPages;
        this.isbn = isbn;
    }

    //Getter and Setters
    //giving us maximum control over how to access the variable within the object
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
}
