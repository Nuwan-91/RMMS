package io.egreen.rmms.customer.database.dao;

import io.egreen.apistudio.datalayer.mongodb.dao.DAOController;
import io.egreen.rmms.customer.database.entity.Customer;


/**
 * Created by nuwan on 9/1/16.
 */
public interface CustomerDAOController extends DAOController<Customer> {


    Boolean updateCustomer(Customer customer);

    Customer GetCustomerById(String customerId);
}


