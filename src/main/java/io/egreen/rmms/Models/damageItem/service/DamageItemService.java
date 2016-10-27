package io.egreen.rmms.Models.damageItem.service;

import io.egreen.rmms.Models.damageItem.database.dao.DamageItemDAOController;
import io.egreen.rmms.Models.damageItem.database.entity.DamageItem;
import org.mongodb.morphia.Key;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nuwan on 9/20/16.
 */
public class DamageItemService {

    @Inject
    DamageItemDAOController damageItemDAOController;

    public String save(DamageItem damageItem) {

        Key<DamageItem> damageItemKey=damageItemDAOController.create(damageItem);
        String s=damageItemKey.toString();

        return s;
    }

    public List<DamageItem> getAll(int offset, int limit) {
        return damageItemDAOController.getAll(offset,limit);
    }
}
