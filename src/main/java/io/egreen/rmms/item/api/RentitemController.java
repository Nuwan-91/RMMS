package io.egreen.rmms.item.api;
import io.egreen.rmms.Models.ReturnIdModel;
import io.egreen.rmms.item.database.entity.RentItem;
import io.egreen.rmms.item.service.RentItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by nuwan on 9/1/16.
 */
@Api("Rent Item")
@Path("RentItem")
@Consumes("application/json")
@Produces("application/json")

public class RentitemController {

    @Inject
    RentItemService rentItemService;


    @Path("/save")
    @POST
    @ApiOperation(
            value = "save Rent Item",
            notes = "Save an Rent Item to the Database"
    )
    public ReturnIdModel save(RentItem rentItem){
        String res=rentItemService.save(rentItem);
        ReturnIdModel returnIdModel=new ReturnIdModel();
        returnIdModel.setId(res);
        return returnIdModel;
    }


    @Path("/getAllRentItems")
    @GET
    @ApiOperation(
            value = "get All Rent Items",
            notes = "show all rent item details"
    )
    public List<RentItem> getAll(){
        return rentItemService.getAll();
    }


    @Path("/ob")
    @GET
    @ApiOperation(
            value = "Get Rent Item Object",
            notes = "Get an object of a rent item"
    )
    public RentItem getOb(){
        return new RentItem();
    }



}