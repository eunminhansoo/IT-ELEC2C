package demo.model.vehicle;

import demo.model.engine.Engine;

public class Wigo extends ToyotaVehicle {
	
	/*
	 This is a HAS-A object relationship. The
	 presence of another object inside a class
	 means that class will own the object 
	 that is inside.
	 
	  The statement will become "That 
	  any subclass of ToyotaVehicle, 
	  it has an equivalent engine.".
	 */
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public String viewModel() {
		System.out.println("2017 Toyota Wigo");
		System.out.println("A cute and sarap isingit car.");

		return "2017 Toyota Wigo <br/>" +  
		"A cute and sarap isingit car.";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 600,000.00");
		
		return "Php 600,000.00";
	}
}
