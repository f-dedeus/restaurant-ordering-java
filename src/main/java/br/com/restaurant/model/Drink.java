package br.com.restaurant.model;

import java.math.BigDecimal;

public class Drink extends MenuItem {

    private final int volumeMl;
    private final boolean alcoholic;

    public Drink(String name, BigDecimal price, int volumeMl, boolean alcoholic) {
        super(name, price);
        if (volumeMl <= 0) {
            throw new IllegalArgumentException("Volume must be greater than zero");
        }
        this.volumeMl = volumeMl;
        this.alcoholic = alcoholic;
    }

    @Override
    public Category getCategory() {
        return Category.DRINK;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    @Override
    public String toString() {
        return super.toString() + " " + volumeMl + "ml" + (alcoholic ? " (+18)" : "");
    }
}