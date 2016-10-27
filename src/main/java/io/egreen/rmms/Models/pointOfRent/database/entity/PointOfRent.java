package io.egreen.rmms.Models.pointOfRent.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by nuwan on 9/13/16.
 */

@Entity
public class PointOfRent {

    @Id
    @JsonIgnore
    private ObjectId id;

    private String customerId;
    private String itemId;
    private String hiringDate;
    private String dueDate;
    private Boolean orderComplete;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Boolean getOrderComplete() {
        return orderComplete;
    }

    public void setOrderComplete(Boolean orderComplete) {
        this.orderComplete = orderComplete;
    }


    @Override
    public String toString() {
        return "PointOfRent{" +
                "id=" + id +
                ", customerId='" + customerId + '\'' +
                ", itemId='" + itemId + '\'' +
                ", hiringDate='" + hiringDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", orderComplete=" + orderComplete +
                '}';
    }

}


