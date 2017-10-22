package demo.model.accessories;


public class Ring extends Accessories{
	
	@Override
	public String displayAccessories() {
		System.out.println("Casual Jeans. Better than Levis");
		
		return "Casual Jeans. Better than Levis";
	}

	@Override
	public String displayAccessoriesPrice() {
		System.out.println("PHP 10,000.00");
		
		return "PHP 10,000.00";
	}

}
