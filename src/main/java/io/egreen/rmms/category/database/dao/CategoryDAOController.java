package io.egreen.rmms.category.database.dao;

import io.egreen.apistudio.datalayer.mongodb.dao.DAOController;
import io.egreen.rmms.category.database.entity.Category;

import java.util.List;

/**
 * Created by nuwan on 9/8/16.
 */
public interface CategoryDAOController extends DAOController<Category> {

    List<Category> getAllMainCategories();

    List<Category> GetAllSubCategoriesByMainCategory(String generalId);

}
