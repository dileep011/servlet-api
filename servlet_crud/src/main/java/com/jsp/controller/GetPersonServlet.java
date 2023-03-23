package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.Person;
import com.jsp.service.PersonService;
@WebServlet("/edit")
public class GetPersonServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person=new Person();
		PersonService personservice=new PersonService();
		int id=Integer.parseInt(req.getParameter("id"));
		Person person1=personservice.getPersonById(id);
		
		if(person1!=null) {
			req.setAttribute("person", person1);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("updateperson.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("editperson.jsp");
			requestDispatcher.include(req, resp);
			
		}
		
	}

}
