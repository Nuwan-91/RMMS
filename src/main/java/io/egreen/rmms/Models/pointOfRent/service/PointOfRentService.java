package io.egreen.rmms.Models.pointOfRent.service;

import io.egreen.rmms.Models.pointOfRent.database.dao.PointOfRentDAOController;
import io.egreen.rmms.Models.pointOfRent.database.entity.PointOfRent;
import org.mongodb.morphia.Key;


import javax.inject.Inject;

/**
 * Created by nuwan on 9/13/16.
 */
public class PointOfRentService {

    @Inject
    PointOfRentDAOController pointOfRentDAOController;

    public String save(PointOfRent pointOfRent) {
        Key<PointOfRent> pointOfRentKey=pointOfRentDAOController.create(pointOfRent);
        return pointOfRentKey.toString();
    }
}
