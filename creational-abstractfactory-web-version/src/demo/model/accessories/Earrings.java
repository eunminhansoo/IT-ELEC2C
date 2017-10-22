package demo.model.accessories;

public class Earrings extends Accessories{
	
	@Override
	public String displayAccessories() {
		System.out.println("Earrings to match your attire");
		
		return "Earrings to match your attire";
	}

	@Override
	public String displayAccessoriesPrice() {
		System.out.println("PHP 7,000.00");
		
		return "PHP 7,000.00";
	}

}
