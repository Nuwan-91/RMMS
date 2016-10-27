package io.egreen.rmms.Models.addCustomer.api;

import io.egreen.rmms.Models.addCustomer.database.entity.AddCustomer;
import io.egreen.rmms.Models.addCustomer.service.AddCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.*;

/**
 * Created by nuwan on 9/13/16.
 */

@Api("AddCustomer")
@Path("AddCustomer")
@Consumes("application/json")
@Produces("applicatioin/json")
public class AddCustomerController {

    @Inject
    private AddCustomerService addCustomerService;


    @Path("/save")
    @POST
    @ApiOperation(
            value = "save AddCustomer",
            notes = "save AddCustomer to database"
    )
    public boolean save(AddCustomer addCustomer){
        String res=addCustomerService.save(addCustomer);

        if(res!=null){
            return true;
        }return false;
    }




    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get AddCustomerObject",
            notes = "get AddCustomer object"
    )
    public AddCustomer ob(){
        return new AddCustomer();
    }
}
