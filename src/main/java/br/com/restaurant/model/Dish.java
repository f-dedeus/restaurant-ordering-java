package br.com.restaurant.model;

import java.math.BigDecimal;

public class Dish extends MenuItem {

    private final Category category;
    private final boolean vegetarian;

    public Dish(String name, BigDecimal price, Category category, boolean vegetarian) {
        super(name, price);
        if (category == Category.DRINK) {
            throw new IllegalArgumentException("Use the Drink class for drinks");
        }
        this.category = category;
        this.vegetarian = vegetarian;
    }

    @Override
    public Category getCategory() {
        return category;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public String toString() {
        return super.toString() + (vegetarian ? " (V)" : "");
    }
}