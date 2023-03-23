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
@WebServlet("/update")
public class UpdatePersonServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person person=new Person();
		PersonService personService=new PersonService();
		person.setId(Integer.parseInt(req.getParameter("id")));
		person.setName(req.getParameter("name"));
		person.setEmail(req.getParameter("email"));
		person.setPassword(req.getParameter("password"));
		person.setAge(Integer.parseInt(req.getParameter("age")));
		Person person1=personService.updatePerson(person);
		if(person1!=null) {
			req.setAttribute("person", person1);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("editperson.jsp");
			requestDispatcher.include(req, resp);
			
			
		}
		
	}
}
