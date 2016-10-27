package io.egreen.rmms.Models.addItem.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by nuwan on 9/13/16.
 */

@Entity
public class AddItem {


    @Id
    @JsonIgnore
    private ObjectId id;

    private String adminId;
    private String itemId;
    private String addedDate;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }


    @Override
    public String toString() {
        return "AddItem{" +
                "id=" + id +
                ", adminId='" + adminId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", addedDate='" + addedDate + '\'' +
                '}';
    }
}
