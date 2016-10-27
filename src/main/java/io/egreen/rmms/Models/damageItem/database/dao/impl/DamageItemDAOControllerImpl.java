package io.egreen.rmms.Models.damageItem.database.dao.impl;

import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;
import io.egreen.rmms.Models.damageItem.database.dao.DamageItemDAOController;
import io.egreen.rmms.Models.damageItem.database.entity.DamageItem;

/**
 * Created by nuwan on 9/20/16.
 */
public class DamageItemDAOControllerImpl extends AbstractDAOController<DamageItem> implements DamageItemDAOController {

    public DamageItemDAOControllerImpl(){
        super(DamageItem.class);
    }
}
