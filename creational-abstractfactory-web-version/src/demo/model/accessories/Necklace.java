package demo.model.accessories;


public class Necklace extends Accessories{
	
	@Override
	public String displayAccessories() {
		System.out.println("Necklace to show off the Emerald");
		
		return "Necklace to show off the Emerald";
	}

	@Override
	public String displayAccessoriesPrice() {
		System.out.println("PHP 4,000.00");
		
		return "PHP 4,000.00";
	}

}
