package io.egreen.rmms.Models.addCustomer.service;

import io.egreen.rmms.Models.addCustomer.database.dao.AddCustomerDAOController;
import io.egreen.rmms.Models.addCustomer.database.entity.AddCustomer;
import org.mongodb.morphia.Key;

import javax.inject.Inject;

/**
 * Created by nuwan on 9/13/16.
 */
public class AddCustomerService {

    @Inject
    private AddCustomerDAOController addCustomerDAOController;

    public String save(AddCustomer addCustomer) {
        Key<AddCustomer> addCustomerKey=addCustomerDAOController.create(addCustomer);
        return addCustomerKey.toString();

    }
}
