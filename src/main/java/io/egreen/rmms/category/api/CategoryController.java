package io.egreen.rmms.category.api;

import io.egreen.rmms.category.database.entity.Category;
import io.egreen.rmms.category.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.List;

/**
 * Created by nuwan on 9/8/16.
 */
@Api("/Category")
@Path("/Category")

public class CategoryController {

    @Inject
    CategoryService categoryService;

    @Path("/save")
    @POST
    @ApiOperation(
            value = "save a category",
            notes = "save a category to database"
    )
    public boolean save(Category category){
        String res=categoryService.save(category);
        if (res!=null){
            return true;
        }
        return false;
    }



    @Path("/getAllCategories/{offset}/{limit}")
    @GET
    @ApiOperation(
            value = "get All Categories",
            notes = "get all Categories"
    )
    public List<Category> getAll(@PathParam("offset") int offset, @PathParam("limit") int limit) {
        return categoryService.getAll(offset, limit);
    }



    @Path("/getAllMainCategories")
    @GET
    @ApiOperation(
            value = "get all main categories objects",
            notes = "get all main categories objects"
    )
    public List<Category> getAllMainCategories(){
        return categoryService.getAllMainCategories();
    }


    @Path("/GetAllSubCategoriesByMainCategory/{generalId}")
    @GET
    @ApiOperation(
            value = "get all sub categories of the main category",
            notes = "get all sub categories of the main category"
    )
    public List<Category> GetAllSubCategoriesByMainCategory(@PathParam("generalId") String generalId){
        return categoryService.GetAllSubCategoriesByMainCategory(generalId);
    }


    @Path("/ob")
    @GET
    @ApiOperation(
            value = "get category object",
            notes = "get category object"
    )
    public Category getOb(){
        return new Category();
    }
}
