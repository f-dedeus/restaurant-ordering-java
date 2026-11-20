package br.com.restaurant.model;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class MenuItem {

    private static long nextId = 1;

    private final long id;
    private String name;
    private BigDecimal price;
    private boolean available;

    protected MenuItem(String name, BigDecimal price) {
        this.id = nextId++;
        setName(name);
        setPrice(price);
        this.available = true;
    }

    public abstract Category getCategory();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (price == null || price.signum() <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero");
        }
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem other)) return false;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return String.format("#%d %-20s R$ %8.2f  [%s]%s",
                id, name, price, getCategory().getDisplayName(),
                available ? "" : " (unavailable)");
    }
}