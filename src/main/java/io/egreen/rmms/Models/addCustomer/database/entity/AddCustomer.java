package io.egreen.rmms.Models.addCustomer.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by nuwan on 9/13/16.
 */

@Entity
public class AddCustomer {

    @Id
    @JsonIgnore
    private ObjectId id;

    private String adminId;
    private String customerId;
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }


    @Override
    public String toString() {
        return "AddCustomer{" +
                "id=" + id +
                ", adminId='" + adminId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", addedDate='" + addedDate + '\'' +
                '}';
    }
}
