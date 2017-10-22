package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.top.*;
import demo.model.bottom.*;
import demo.utility.*;

@WebServlet("/selection.html")
public class Process extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String a = request.getParameter("preferredFashion");
	
		//now we create an object based on the 
		//client's preference
		YashaTop topwear = new TopFactory()
			.getTop(a);
		
		//set the engine
		Bottom bottom = new BottomFactory()
			.getBottom(a);
		
		//set the ownership of the created engine to 
		//the vehicle created
		topwear.setBottom(bottom);
	
		//perform data binding on request
		request.setAttribute("fashion", topwear);
		
		//once the relationship has been set,
		//forward the result to a jsp file
		request.getRequestDispatcher("display.jsp")
			.forward(request, response);
	}
}
