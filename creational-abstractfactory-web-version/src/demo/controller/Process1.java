package demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.jewel.*;
import demo.model.accessories.*;
import demo.utility.*;

@WebServlet("/selection1.html")
public class Process1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String b = request.getParameter("preferredFashion1");
	
		//now we create an object based on the 
		//client's preference
		YashaJewel jewelwear = new JewelFactory()
			.getJewel(b);
		
		//set the engine
		Accessories accessories = new AccessoriesFactory()
			.getAccessories(b);
		
		//set the ownership of the created engine to 
		//the vehicle created
		jewelwear.setAccessories(accessories);
	
		//perform data binding on request
		request.setAttribute("fashion1", jewelwear);
		
		//once the relationship has been set,
		//forward the result to a jsp file
		request.getRequestDispatcher("display1.jsp")
			.forward(request, response);
	}
}
