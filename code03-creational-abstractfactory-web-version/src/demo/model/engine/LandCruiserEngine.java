package demo.model.engine;

public class LandCruiserEngine extends Engine {

	@Override
	public String diplayEngineType() {
		System.out.println("An engine for Land Cruiser");
	
		return "An engine for Land Cruiser";
	}

	@Override
	public String literAndHorsePower() {
		System.out.println("5L and  500 HP");
		
		return "5L and  500 HP";
	}

}
