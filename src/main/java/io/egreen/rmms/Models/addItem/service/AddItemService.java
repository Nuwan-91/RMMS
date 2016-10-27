package io.egreen.rmms.Models.addItem.service;

import io.egreen.rmms.Models.addItem.database.dao.AddItemDAOController;
import io.egreen.rmms.Models.addItem.database.entity.AddItem;
import org.mongodb.morphia.Key;

import javax.inject.Inject;

/**
 * Created by nuwan on 9/13/16.
 */
public class AddItemService {

    @Inject
    AddItemDAOController addItemDAOController;

    public String save(AddItem addItem) {
        Key<AddItem> addItemKey=addItemDAOController.create(addItem);
        return addItemKey.toString();
    }
}
