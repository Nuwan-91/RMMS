package io.egreen.rmms.customer.api;

import io.egreen.rmms.customer.database.entity.Customer;
import io.egreen.rmms.customer.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mongodb.morphia.query.UpdateResults;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by nuwan on 9/1/16.
 */
@Api("/Customer")
@Path("/Customer")
@Consumes("application/json")
@Produces("application/json")

public class CustomerController {

    @Inject
    private CustomerService customerService;


    @Path("/save")
    @POST
    @ApiOperation(
            value = "save Customer",
            notes = "save Customer to the database"
    )
    public Boolean save(Customer customer) {
        String res = customerService.save(customer);

        if (res != null) {
            return true;
        }
        return false;
    }




    @Path("/update")
    @POST
    @ApiOperation(
            value = "Update Customer",
            notes = "Update a Customer from Customer id"
    )
    public Boolean updateCustomer(Customer customer){

        return customerService.updateCustomer(customer);

    }




    @Path("/getAllCustomers/{offset}/{limit}")
    @GET
    @ApiOperation(
            value = "get All Customers",
            notes = "show all customers"
    )
    public List<Customer> getAll(@PathParam("offset") int offset, @PathParam("limit") int limit) {
        return customerService.getAll(offset, limit);
    }




    @Path("/GetCustomerById")
    @GET
    @ApiOperation(
            value = "Get Customer By Id",
            notes = "Get Customer By Id"
    )
    public Customer searchCustomerById(@QueryParam("customerId") String customerId){

        return customerService.GetCustomerById(customerId);
    }


    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get Customer Object",
            notes = "Get Customer Object"
    )
    public Customer getOb() {
        return new Customer();
    }

}



