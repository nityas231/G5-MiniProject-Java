package com.cybage.controller;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.service.UserService;
import com.cybage.model.Category;
import com.cybage.service.UserServiceImpl;

public class UserController extends HttpServlet {
	
	private UserDao userDao = new UserDaoImpl();

	private UserService userService = new UserServiceImpl(userDao);

	private static final long serialVersionUID = 1L;

	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		String path = request.getPathInfo();

		if (path.equals("/list")) {
			try {
				List<Category> categories = userService.findCategory();
				request.setAttribute("categories", categories);

				request.getRequestDispatcher("/index.jsp").forward(request, response);

			} catch (Exception e) {
				System.out.println("error occurred: " + e.getMessage());
			}
		}
		}
		
	
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	PrintWriter pw = response.getWriter();

	String path = request.getPathInfo();

	if (path.equals("/list")) {
		try {
			List<Category> categories = userService.findCategory();
			request.setAttribute("categories", categories);

			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} catch (Exception e) {
			System.out.println("error occurred: " + e.getMessage());
		}
	}
}
}
