package io.egreen.rmms.item.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 * Created by nuwan on 9/6/16.
 */

@Entity
@Indexes(
        @Index(value = "name", fields = @Field("name"))
)


public class Item {
    @Id
    @JsonIgnore
    private ObjectId id;

    private String itemId;
    private String itemName;
    private String categoryId;
    private String subCategoryId;
    private String purchasePrice;
    private String category;
    private String rentPercentage;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(String subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getCatogary() {
        return category;
    }

    public void setCatogary(String category) {
        this.category = category;
    }

    public String getRentPercentage() {
        return rentPercentage;
    }

    public void setRentPercentage(String rentPercentage) {
        this.rentPercentage = rentPercentage;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", itemId='" + itemId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", subCategoryId='" + subCategoryId + '\'' +
                ", purchasePrice='" + purchasePrice + '\'' +
                ", category='" + category + '\'' +
                ", rentPercentage='" + rentPercentage + '\'' +
                '}';
    }
}


