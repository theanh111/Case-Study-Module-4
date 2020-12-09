package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "cart_detail")
public class CartDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "product_id")
    @ManyToOne
    private Product product;

    @JoinColumn(name = "cart_id")
    @ManyToOne
    private Cart cart;

    private Integer price;
    private Integer quantity;

    public CartDetail() {
    }

    public CartDetail(Product product, Cart cart, Integer price, Integer quantity) {
        this.product = product;
        this.cart = cart;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
