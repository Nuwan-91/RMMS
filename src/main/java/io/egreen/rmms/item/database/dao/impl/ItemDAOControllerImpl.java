package io.egreen.rmms.item.database.dao.impl;

import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;
import io.egreen.rmms.item.database.dao.ItemDAOController;
import io.egreen.rmms.item.database.entity.Item;

/**
 * Created by nuwan on 9/6/16.
 */
public class ItemDAOControllerImpl extends AbstractDAOController<Item> implements ItemDAOController {

    public ItemDAOControllerImpl(){
        super(Item.class);
    }
}
