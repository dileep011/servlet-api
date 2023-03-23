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
@WebServlet("/deleteperson")
public class DeletePersonServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person=new Person();
		PersonService personService=new PersonService();
		person.setId(Integer.parseInt(req.getParameter("id")));
		Person person1=personService.deletePersonData(person);
		if(person1!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
			requestDispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("deleteperson.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
