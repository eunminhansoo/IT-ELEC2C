package demo.model.bottom;

public class Sweatpants extends Bottom{
	
	@Override
	public String displayBottom() {
		System.out.println("Sweatpants perfect for running");
		
		return "Sweatpants perfect for running";
	}

	@Override
	public String displayBottomPrice() {
		System.out.println("PHP 8,000.00");
		
		return "PHP 8,000.00";
	}

}
