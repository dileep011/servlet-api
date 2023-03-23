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
@WebServlet("/saveperson")
public class SavePersonController extends HttpServlet{
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Person person=new Person();
			PersonService personservice=new PersonService();
			person.setName(req.getParameter("name"));
			person.setEmail(req.getParameter("email"));
			person.setPassword(req.getParameter("password"));
			person.setAge(Integer.parseInt(req.getParameter("age")));
			
			if(personservice.savePerson(person)!=null) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
				requestDispatcher.forward(req, resp);
			}else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveperson.jsp");
				requestDispatcher.include(req, resp);
				
			}
			
			
		}
	

	}


