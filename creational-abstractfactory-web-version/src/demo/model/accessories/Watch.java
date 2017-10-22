package demo.model.accessories;

public class Watch extends Accessories{
	
	@Override
	public String displayAccessories() {
		System.out.println("A watch with jewels. Just like Rolex");
		
		return "A watch with jewels. Just like Rolex";
	}

	@Override
	public String displayAccessoriesPrice() {
		System.out.println("PHP 20,000.00");
		
		return "PHP 20,000.00";
	}

}
