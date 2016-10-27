package io.egreen.rmms.customer.service;

import io.egreen.rmms.customer.api.CustomerController;
import io.egreen.rmms.customer.database.dao.CustomerDAOController;
import io.egreen.rmms.customer.database.entity.Customer;
import org.mongodb.morphia.Key;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.mongodb.morphia.query.UpdateResults;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nuwan on 9/1/16.
 */
public class CustomerService {
    @Inject
    CustomerDAOController customerDAOController;




    public String save(Customer customer) {
        Key<Customer> customerKey = customerDAOController.create(customer);
        return customerKey.toString();
    }



    public List<Customer> getAll(int offset, int limit) {
        return customerDAOController.getAll(offset, limit);
    }



    public Boolean updateCustomer(Customer customer) {

/*        List<Customer> customerList=customerController.getAll(1,1000);

        for (Customer customer1 : customerList) {
            if(customer1==customer){
                customerDAOController.updateCustomer(customer);
            }
        }
        return false;*/

        return customerDAOController.updateCustomer(customer);

    }



    public Customer GetCustomerById(String customerId) {
        return customerDAOController.GetCustomerById(customerId);
    }
}
