package io.egreen.rmms.Models.damageItem.api;

import io.egreen.rmms.Models.damageItem.database.entity.DamageItem;
import io.egreen.rmms.Models.damageItem.service.DamageItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by nuwan on 9/20/16.
 */

@Api("DamageItem")
@Path("DamageItem")
@Consumes("applicatioin/json")
@Produces("applicatioin/json")
public class DamageItemController {

    @Inject
    private DamageItemService damageItemService;



    @Path("/save")
    @POST
    @ApiOperation(
            value = "save a damage item",
            notes = "save damaged item"
    )
    public boolean save(DamageItem damageItem){
        String res= damageItemService.save(damageItem);

        if(res!=null){
            return true;
        }return false;
    }



    @Path("/getAll")
    @GET
    @ApiOperation(
            value = "get All damaged items",
            notes = "get All damaged items"
    )
    public List<DamageItem> getAll(@QueryParam("offset") int offset, @QueryParam("limit") int limit){
        return damageItemService.getAll(offset,limit);
    }



    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get object",
            notes = "get an damage item object"
    )
    public DamageItem ob(){
        return new DamageItem();
    }

}
