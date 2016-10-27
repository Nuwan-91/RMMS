package io.egreen.rmms.Models.pointOfRent.api;

import io.egreen.rmms.Models.pointOfRent.database.entity.PointOfRent;
import io.egreen.rmms.Models.pointOfRent.service.PointOfRentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.*;

/**
 * Created by nuwan on 9/13/16.
 */

@Api("PointOfRent")
@Path("PointOfRent")
@Consumes("application/json")
@Produces("application/json")
public class PointOfRentController {

    @Inject
    private PointOfRentService pointOfRentService;


    @Path("/save")
    @POST
    @ApiOperation(
            value = "save PointOfRent",
            notes = "save PointOfRent to database"
    )
    public boolean save(PointOfRent pointOfRent){
        String res=pointOfRentService.save(pointOfRent);

        if(res!=null){
            return true;
        }return false;
    }


    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get PointOfRent object",
            notes = "get PointOfRent object"
    )
    public PointOfRent ob(){
        return new PointOfRent();
    }
}
