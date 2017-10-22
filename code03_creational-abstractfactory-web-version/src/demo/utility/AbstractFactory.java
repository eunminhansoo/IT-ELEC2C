package demo.utility;

import demo.model.vehicle.*;
import demo.model.engine.*;

public interface AbstractFactory {

	/*
	 NOTE: All methods declared in an interface are 
	 automatically public abstract. 
	 */
	ToyotaVehicle getVehicle(String input);
	Engine getEngine(String name);
}
