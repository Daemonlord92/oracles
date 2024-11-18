package org.blitmatthew.entity;

import java.time.LocalDate;

public class Person {
    private String name;
    private String gender;
    private Integer age;
    private LocalDate dob;

    public Person() {
    }

    public Person(String name, String gender, Integer age, LocalDate dob) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", age=").append(age);
        sb.append(", dob=").append(dob);
        sb.append('}');
        return sb.toString();
    }
}
