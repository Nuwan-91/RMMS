package io.egreen.rmms.admin.database.dao.impl;

import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;
import io.egreen.rmms.admin.database.dao.AdminDAOController;
import io.egreen.rmms.admin.database.entity.Admin;
import org.mongodb.morphia.query.Query;

import java.util.List;

/**
 * Created by nuwan on 9/7/16.
 */
public class AdminDAOControllerimpl extends AbstractDAOController<Admin> implements AdminDAOController {


    public AdminDAOControllerimpl() {
        super(Admin.class);
    }

}
