package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private Double size;
    private String description;
    private String image;

    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;

    @JoinColumn(name = "cart_id")
    @ManyToOne
    private Cart cart;

    public Product() {
    }

    public Product(String name, Integer price, Double size, String description, String image, Category category, Cart cart) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.description = description;
        this.image = image;
        this.category = category;
        this.cart = cart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
