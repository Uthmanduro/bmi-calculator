package com.example.bmi_calculator.model;

public class Person {
    private double weight;
    private double height;
    private String name;
    private int age;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    private String unit;

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(double weight, String name, double height, int age) {
        this.weight = weight;
        this.name = name;
        this.height = height;
        this.age = age;
    }
}
