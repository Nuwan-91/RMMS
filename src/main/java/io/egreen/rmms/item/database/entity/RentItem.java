package io.egreen.rmms.item.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 * Created by nuwan on 9/1/16.
 */

@Entity("item")
@Indexes(
        @Index(value = "name", fields = @Field("name"))
)

public class RentItem {

    @Id
    @JsonIgnore
    private ObjectId id;

    private String itemId;
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
                ", rentPercentage='" + rentPercentage + '\'' +
                '}';
    }
}
