package io.egreen.rmms.customer.database.dao.impl;

import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;
import io.egreen.rmms.customer.database.dao.CustomerDAOController;
import io.egreen.rmms.customer.database.entity.Customer;
import org.mongodb.morphia.query.*;

/**
 * Created by nuwan on 9/1/16.
 */
public class CustomerDAOControllerImpl extends AbstractDAOController<Customer> implements CustomerDAOController {

    public CustomerDAOControllerImpl() {
        super(Customer.class);
    }

    @Override
    public Boolean updateCustomer(Customer customer) {
        Query<Customer> query = getQuery();
        query.filter("customerId", customer.getCustomerId());

        UpdateOperations<Customer> updateOperations = getDatastore().createUpdateOperations(Customer.class);

        updateOperations.set("fname", customer.getFname());
        updateOperations.set("lname", customer.getLname());
        updateOperations.set("address", customer.getAddress());
        updateOperations.set("nic", customer.getNic());
        updateOperations.set("phone", customer.getPhone());
        updateOperations.set("email", customer.getEmail());

        getDatastore().update(query, updateOperations);
        return true;
    }



    @Override
    public Customer GetCustomerById(String customerId) {

        Query<Customer> query = getQuery();
        query.filter("customerId", customerId);

        return query.get();
    }
}


