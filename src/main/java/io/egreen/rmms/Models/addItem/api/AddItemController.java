package io.egreen.rmms.Models.addItem.api;

import io.egreen.rmms.Models.addItem.database.entity.AddItem;
import io.egreen.rmms.Models.addItem.service.AddItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.*;

/**
 * Created by nuwan on 9/13/16.
 */

@Api("AddItem")
@Path("AddItem")
@Consumes("application/json")
@Produces("application/json")
public class AddItemController {

    @Inject
    private AddItemService addItemService;

    @Path("/save")
    @POST
    @ApiOperation(
            value = "save AddItem",
            notes = "Details of Adding an Item"
    )
    public boolean save(AddItem addItem){
        String res=addItemService.save(addItem);

        if (res!=null){
            return true;
        }return  false;
    }



    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get AddItem object",
            notes = "get AddItem Object"
    )
    public AddItem ob(){
        return new AddItem();
    }



}
