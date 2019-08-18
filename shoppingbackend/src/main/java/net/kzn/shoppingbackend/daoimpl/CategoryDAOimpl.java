package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	public static List<Category> categories = new ArrayList<>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("tv");
		category.setDescription("LED");
		category.setImageurl("cat_1.png");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("washing machine");
		category.setDescription("5kg");
		category.setImageurl("cat_2.png");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("mobile");
		category.setDescription("4g");
		category.setImageurl("cat_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub

		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories)
			
		{
			
			if (category.getId() == id)
			return category;
		}

		return null;
	}

}
