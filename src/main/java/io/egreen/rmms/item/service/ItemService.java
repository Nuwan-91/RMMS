package io.egreen.rmms.item.service;

import io.egreen.rmms.item.database.dao.ItemDAOController;
import io.egreen.rmms.item.database.entity.Item;
import org.mongodb.morphia.Key;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nuwan on 9/6/16.
 */
public class ItemService {

    @Inject
    ItemDAOController itemDAOController;


    public String save(Item item) {
        Key<Item> itemKey=itemDAOController.create(item);
        return itemKey.toString();
    }

    public List<Item> getAll(int offset, int limit) {
        return itemDAOController.getAll(offset,limit);
    }
}
