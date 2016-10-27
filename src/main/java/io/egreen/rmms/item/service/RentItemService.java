package io.egreen.rmms.item.service;

import io.egreen.rmms.item.database.dao.RentItemDAOController;
import io.egreen.rmms.item.database.entity.RentItem;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nuwan on 9/6/16.
 */
public class RentItemService {

    @Inject
    RentItemDAOController rentItemDAOController;

    public String save(RentItem rentItem) {
        return null;
    }

    public List<RentItem> getAll() {
        return rentItemDAOController.getAll(1,1000);
    }
}
