package io.egreen.rmms.item.api;


import io.egreen.rmms.item.database.entity.Item;
import io.egreen.rmms.item.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by nuwan on 9/6/16.
 */
@Api("Item")
@Path("Item")
@Consumes("application/json")
@Produces("application/json")
public class ItemController {

    @Inject
    ItemService itemService;



    @Path("/save")
    @POST
    @ApiOperation(
            value = "save Item",
            notes = "Save an Item to the Database"
    )
    public Boolean save(Item item){
        String res=itemService.save(item);
/*        ReturnIdModel returnIdModel=new ReturnIdModel();
        returnIdModel.setId(res);
        return returnIdModel;*/
        if(res!=null){
            return true;
        }
        return false;
    }



    @Path("/getAllItems")
    @GET
    @ApiOperation(
            value = "get All Items",
            notes = "show all item details"
    )
    public List<Item> getAll(@QueryParam("offset") int offset, @QueryParam("limit") int limit){
        return itemService.getAll(offset,limit);
    }


    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get Item Object",
            notes = "Get an object of a rentItem"
    )
    public Item getOb(){
        return new Item();
    }
}
