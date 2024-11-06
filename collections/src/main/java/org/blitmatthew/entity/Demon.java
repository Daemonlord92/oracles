package org.blitmatthew.entity;

import java.util.Comparator;
import java.util.Objects;

public class Demon implements Comparable<Demon>, Comparator<Demon> {
    private String name;
    private String subLevel;
    private Integer attackPower;
    private Integer defensePower;

    public Demon() {
    }

    public Demon(String name, String subLevel, Integer attackPower, Integer defensePower) {
        this.name = name;
        this.subLevel = subLevel;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubLevel() {
        return subLevel;
    }

    public void setSubLevel(String subLevel) {
        this.subLevel = subLevel;
    }

    public Integer getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(Integer attackPower) {
        this.attackPower = attackPower;
    }

    public Integer getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(Integer defensePower) {
        this.defensePower = defensePower;
    }
    //The TreeSet will use this to provide a natural order for the custom objects
    @Override
    public int compare(Demon o1, Demon o2) {
        int attackPowerCompare = o1.getAttackPower().compareTo(o2.getAttackPower());
        if(attackPowerCompare != 0) {
            return attackPowerCompare;
        }
        return Integer.compare(o1.getDefensePower(), o2.getDefensePower());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demon demon = (Demon) o;
        return Objects.equals(getAttackPower(), demon.getAttackPower()) && Objects.equals(getDefensePower(), demon.getDefensePower());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAttackPower(), getDefensePower());
    }
    //The TreeSet will use this to provide a natural order for the custom objects
    @Override
    public int compareTo(Demon o) {
        return this.getAttackPower() - o.getAttackPower();
    }

    @Override
    public String toString() {
        return "Demon{" +
                "name='" + name + '\'' +
                ", subLevel='" + subLevel + '\'' +
                ", attackPower=" + attackPower +
                ", defensePower=" + defensePower +
                '}';
    }
}
