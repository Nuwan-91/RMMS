package io.egreen.rmms.category.database.dao.impl;

import com.google.common.base.Objects;
import io.egreen.apistudio.datalayer.mongodb.dao.impl.AbstractDAOController;
import io.egreen.rmms.category.database.dao.CategoryDAOController;
import io.egreen.rmms.category.database.entity.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nuwan on 9/8/16.
 */
public class CategoryDAOControllerImpl extends AbstractDAOController<Category> implements CategoryDAOController{

    public CategoryDAOControllerImpl(){
        super(Category.class);
    }


    @Override
    public List<Category> getAllMainCategories() {

        List<Category> categoryList = getAll(0,1000);
        List<Category> newList = new ArrayList<Category>();

        for (Category category : categoryList) {
            if (category.getSuperCategoryId()==null){
               newList.add(category);
            }
        }

        return newList;
        }


    @Override
    public List<Category> GetAllSubCategoriesByMainCategory(String generalId) {

        List<Category> allCategories = getAll(0,1000);
        List<Category> newList=new ArrayList<Category>();


        for (Category category : allCategories) {
            if(Objects.equal(category.getSuperCategoryId(), new String(generalId))){
                newList.add(category);
            }
        }

    return newList;

}

}




