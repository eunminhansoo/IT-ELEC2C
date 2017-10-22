package demo.model.bottom;

public class Shorts extends Bottom{
	
	@Override
	public String displayBottom() {
		System.out.println("Summer shorts.Comfortable for summer");
		
		return "Summer shorts.Comfortable for summer";
	}

	@Override
	public String displayBottomPrice() {
		System.out.println("PHP 1,000.00");
		
		return "PHP 1,000.00";
	}

}
