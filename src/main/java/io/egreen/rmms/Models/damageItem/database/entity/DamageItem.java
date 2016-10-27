package io.egreen.rmms.Models.damageItem.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by nuwan on 9/20/16.
 */

@Entity
public class DamageItem {

    @Id
    @JsonIgnore
    private ObjectId id;

    private String itemId;
    private String damageClaim;
    private Boolean damagePaid;

    public ObjectId getId(){
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

    public String getDamageClaim() {
        return damageClaim;
    }

    public void setDamageClaim(String damageClaim) {
        this.damageClaim = damageClaim;
    }

    public Boolean getDamagePaid() {
        return damagePaid;
    }

    public void setDamagePaid(Boolean damagePaid) {
        this.damagePaid = damagePaid;
    }



    @Override
    public String toString() {
        return "DamageItem{" +
                "id=" + id +
                ", itemId='" + itemId + '\'' +
                ", damageClaim='" + damageClaim + '\'' +
                ", damagePaid=" + damagePaid +
                '}';
    }
}
