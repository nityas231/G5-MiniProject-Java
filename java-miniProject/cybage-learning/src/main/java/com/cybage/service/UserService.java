package com.cybage.service;

import java.util.List;

import com.cybage.model.Category;

public interface UserService {
	
	public List<Category> findCategory() throws Exception;
	
}
