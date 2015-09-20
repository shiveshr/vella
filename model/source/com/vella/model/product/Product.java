package com.vella.model.product;

import java.util.List;
import java.util.Set;

/**
 * Created by s on 8/23/15.
 * Products are stored in the db after a crawl
 */
public class Product {
    private final String productName;
    private final String skuId;
    private final String description;

    public int getPrice() {
        return price;
    }

    private final int price;
    private final Category category;
    private final List<Category> subcategories;
    private final Set<String> tags;

    public Product(String productName, String skuId, String description, int price, Category category, List<Category> subcategories, Set<String> tags) {
        this.productName = productName;
        this.skuId = skuId;
        this.description = description;
        this.price = price;
        this.category = category;
        this.subcategories = subcategories;
        this.tags = tags;
    }

    public String getProductName() {
        return productName;
    }

    public String getSkuId() {
        return skuId;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public List<Category> getSubcategories() {
        return subcategories;
    }

    public Set<String> getTags() {
        return tags;
    }
}
