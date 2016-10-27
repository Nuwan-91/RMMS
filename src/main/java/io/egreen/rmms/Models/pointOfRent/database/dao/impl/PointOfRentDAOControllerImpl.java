package io.egreen.rmms.Models.pointOfRent.database.dao.impl;

import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;
import io.egreen.rmms.Models.pointOfRent.database.dao.PointOfRentDAOController;
import io.egreen.rmms.Models.pointOfRent.database.entity.PointOfRent;

/**
 * Created by nuwan on 9/13/16.
 */
public class PointOfRentDAOControllerImpl extends AbstractDAOController<PointOfRent> implements PointOfRentDAOController {

    public PointOfRentDAOControllerImpl(){
        super(PointOfRent.class);
    }
}
