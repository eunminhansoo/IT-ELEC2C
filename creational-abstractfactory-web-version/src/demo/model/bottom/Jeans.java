package demo.model.bottom;



public class Jeans extends Bottom{
	
	@Override
	public String displayBottom() {
		System.out.println("Casual Jeans. Better than Levis");
		
		return "Casual Jeans. Better than Levis";
	}

	@Override
	public String displayBottomPrice() {
		System.out.println("PHP 10,000.00");
		
		return "PHP 10,000.00";
	}

}
