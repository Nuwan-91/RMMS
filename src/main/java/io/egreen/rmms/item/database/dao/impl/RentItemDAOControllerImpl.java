package io.egreen.rmms.item.database.dao.impl;

import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;

import io.egreen.rmms.item.database.dao.RentItemDAOController;
import io.egreen.rmms.item.database.entity.RentItem;

/**
 * Created by nuwan on 9/6/16.
 */
public class RentItemDAOControllerImpl extends AbstractDAOController<RentItem> implements RentItemDAOController{

    public RentItemDAOControllerImpl(){
        super(RentItem.class);
    }
}
