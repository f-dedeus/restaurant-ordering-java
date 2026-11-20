package br.com.restaurant.model;

public enum Category {
    STARTER("Starter"),
    MAIN_COURSE("Main course"),
    DESSERT("Dessert"),
    DRINK("Drink");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}