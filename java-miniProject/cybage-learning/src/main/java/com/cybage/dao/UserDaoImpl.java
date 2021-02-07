package com.cybage.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.cybage.model.Category;
import com.cybage.util.DbUtil;

public class UserDaoImpl implements UserDao {
	
	
	public List<Category> findCategory() throws Exception {
		Connection con = DbUtil.getCon();

		String sql = "select category_id, category_name, image_url from category";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		List<Category> categories = new ArrayList<Category>();
		while (rs.next()) {
			Category category = new Category();
			category.setId(rs.getInt(1));
			category.setName(rs.getString(2));
			category.setUrl(rs.getString(3));

			categories.add(category);
		}
		return categories;
	}



}
