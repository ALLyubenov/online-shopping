package com.progress.shoppingbackend.dao;

import java.util.List;

import com.progress.shoppingbackend.dto.Category;

public interface CategoryDAO {

	
	List<Category>list();
	Category get(int id);
	
}
