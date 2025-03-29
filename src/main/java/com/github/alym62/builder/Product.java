package com.github.alym62.builder;

public class Product {
    private final String name;
    private final Double price;
    private final String category;
    private final int quantityStock;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.category = builder.category;
        this.quantityStock = builder.quantityStock;
    }

    public static class Builder {
        private String name;
        private Double price;
        private String category;
        private int quantityStock;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder quantityStock(int quantityStock) {
            this.quantityStock = quantityStock;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", quantityStock=" + quantityStock +
                '}';
    }
}
