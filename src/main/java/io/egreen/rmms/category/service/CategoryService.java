package io.egreen.rmms.category.service;

import io.egreen.rmms.category.database.dao.CategoryDAOController;
import io.egreen.rmms.category.database.entity.Category;
import org.mongodb.morphia.Key;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nuwan on 9/8/16.
 */
public class CategoryService {
    @Inject
    CategoryDAOController categoryDAOController;


    public String save(Category category) {
        Key<Category> categoryKey=categoryDAOController.create(category);
        return categoryKey.toString();
    }


    public List<Category> getAll(int offset, int limit) {
        return categoryDAOController.getAll(offset,limit);
    }


    public List<Category> getAllMainCategories() {
        return categoryDAOController.getAllMainCategories();
    }


    public List<Category> GetAllSubCategoriesByMainCategory(String generalId) {
        return categoryDAOController.GetAllSubCategoriesByMainCategory(generalId);
    }
}
