package io.egreen.rmms.admin.api;

import io.egreen.rmms.admin.database.entity.Admin;
import io.egreen.rmms.admin.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


import javax.inject.Inject;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created by nuwan on 9/7/16.
 */

@Api("Admin")
@Path("Admin")
@Consumes("application/json")
@Produces("application/json")
public class AdminController {

    @Inject
    AdminService adminService;


    @Path("/save")
    @POST
    @ApiOperation(
            value = "save Admin",
            notes = "Save an Admin to the Database"
    )
    public Boolean save(Admin admin){
        String res=adminService.save(admin);

        if (res!=null){
            return true;
        }
        return false;
    }


    @Path("/getAll")
    @GET
    @ApiOperation(
            value = "get All Admins",
            notes = "Show All registered Admins"
    )
    public Object getAll(@QueryParam("offset") int offset, @QueryParam("limit") int limit){
        System.out.println("1");
        return adminService.getAll(offset,limit);
    }


    @Path("ob")
    @GET
    @ApiOperation(
            value = "get Object",
            notes = "Get an Admin Object"
    )
    public Admin ob(){
        return new Admin();
    }

}
