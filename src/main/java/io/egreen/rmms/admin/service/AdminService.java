package io.egreen.rmms.admin.service;

import io.egreen.rmms.admin.database.dao.AdminDAOController;
import io.egreen.rmms.admin.database.entity.Admin;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.geo.LineString;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nuwan on 9/7/16.
 */
public class AdminService {

    @Inject
    private AdminDAOController adminDAOController;


    public String save(Admin admin) {
        Key<Admin> adminKey=adminDAOController.create(admin);
        return adminKey.toString();
    }

    public List<Admin> getAll(int offset, int limit) {
        return adminDAOController.getAll(offset,limit);
    }

}
