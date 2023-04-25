package com.oynaap.store.dto;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Objects;

public class ProductDto implements Serializable {
     private Long id;
    private  String name;
    private  String description;
    private int quantity;
    private  Double price;
    private String brand;
    private  String image;
    private  MultipartFile imageFile;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, Double price, Integer quantity, String brand, String image, MultipartFile imageFile) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.brand = brand;
        this.image = image;
        this.imageFile = imageFile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer stock) {
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto entity = (ProductDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.quantity, entity.quantity) &&
                Objects.equals(this.brand, entity.brand) &&
                Objects.equals(this.image, entity.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, price, quantity, brand, image);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "price = " + price + ", " +
                "stock = " + quantity + ", " +
                "reduction = " + brand + ", " +
                "image = " + image + ")";
    }
}
