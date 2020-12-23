package com.hieunguyennx.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.hieunguyennx.model.Usermodel;

@WebServlet(urlPatterns = { "/trang-chu" })
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
//		Usermodel usermodel = new Usermodel();
//		usermodel.setFullName("Nguyen Trung Hieu");
//		//cach lay fullName cua usermodel de day ra jsp | "model" se co tat cac thuoc tinh cua usermoldel
//		req.setAttribute("model", usermodel);
//		
		RequestDispatcher requestDispatchedDispatcher = req.getRequestDispatcher("/views/web/home-web.jsp");
		requestDispatchedDispatcher.forward(req, res);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

}
