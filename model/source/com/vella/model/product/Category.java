package com.vella.model.product;

/**
 * Created by s on 8/23/15.
 */
public class Category {
    private final String categoryName;
    private final String categoryId;

    public Category(String categoryName, String categoryId) {
        this.categoryName = categoryName;
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryId() {
        return categoryId;
    }
}
