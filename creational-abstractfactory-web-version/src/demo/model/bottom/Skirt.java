package demo.model.bottom;


public class Skirt extends Bottom {
	
	@Override
	public String displayBottom() {
		System.out.println("The perfect skirt for the dress");
		
		return "The perfect skirt for the dress";
	}

	@Override
	public String displayBottomPrice() {
		System.out.println("PHP 15,000.00");
		
		return "PHP 15,000.00";
	}

}
