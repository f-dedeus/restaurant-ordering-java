package br.com.restaurant;

import br.com.restaurant.model.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menu = List.of(
                new Dish("Bruschetta", new BigDecimal("24.90"), Category.STARTER, true),
                new Dish("Picanha", new BigDecimal("89.90"), Category.MAIN_COURSE, false),
                new Dish("Petit gateau", new BigDecimal("32.00"), Category.DESSERT, true),
                new Drink("Lemonade", new BigDecimal("9.50"), 400, false),
                new Drink("Caipirinha", new BigDecimal("22.00"), 300, true)
        );

        menu.forEach(System.out::println);

        try {
            new Drink("Free water", BigDecimal.ZERO, 500, false);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation works: " + e.getMessage());
        }
    }
}