package demo.model.accessories;

public class Bracelet extends Accessories{
	
	@Override
	public String displayAccessories() {
		System.out.println("An alternative accessory if you don't have a watch");
		
		return "An alternative accessory if you don't have a watch";
	}

	@Override
	public String displayAccessoriesPrice() {
		System.out.println("PHP 5,000.00");
		
		return "PHP 5,000.00";
	}

}
