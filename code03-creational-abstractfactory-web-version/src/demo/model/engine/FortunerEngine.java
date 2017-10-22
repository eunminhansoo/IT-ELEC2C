package demo.model.engine;

public class FortunerEngine extends Engine {

	@Override
	public String diplayEngineType() {
		System.out.println("An engine for Fortuner");
		
		return "An engine for Fortuner";
	}

	@Override
	public String literAndHorsePower() {
		System.out.println("3L and  100 HP");
		
		return "3L and  100 HP";
	}
}
