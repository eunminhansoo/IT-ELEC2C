package demo.model.bottom;

public class Pants extends Bottom{
	
	@Override
	public String displayBottom() {
		System.out.println("What's a polo without its slacks");
		
		return "What's a polo without its slacks";
	}

	@Override
	public String displayBottomPrice() {
		System.out.println("PHP 3,000.00");
		
		return "PHP 3,000.00";
	}

}
