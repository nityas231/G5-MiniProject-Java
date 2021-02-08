package com.cybage.dao;

import java.util.List;

import com.cybage.model.Category;

public interface UserDao {
	public List<Category> findCategory() throws Exception;
}
