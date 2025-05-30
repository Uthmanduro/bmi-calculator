package com.example.bmi_calculator.model;

public class Bmi {
    private double unit;
    private String value;
    private String Category;

    public Bmi(double unit, String value, String category) {
        this.unit = unit;
        this.value = value;
        Category = category;
    }

        public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
