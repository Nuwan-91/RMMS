package io.egreen.rmms.category.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by nuwan on 9/8/16.
 */

@Entity("category")
public class Category {

    @Id
    @JsonIgnore
    private ObjectId id;

    private String generalId;
    private String categoryName;
    private String superCategoryId;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getGenaralId() {
        return generalId;
    }

    public void setGenaralId(String genaralId) {
        this.generalId = genaralId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String category) {
        this.categoryName = category;
    }

    public String getSuperCategoryId() {
        return superCategoryId;
    }

    public void setSuperCategoryId(String superCategory) {
        this.superCategoryId = superCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", generalId='" + generalId + '\'' +
                ", category='" + categoryName + '\'' +
                ", superCategory='" + superCategoryId + '\'' +
                '}';
    }
}
