package demo.model.jewel;

import demo.model.accessories.Accessories;

public class Sapphire extends YashaJewel{
	
	private Accessories accessories;
	
	public Accessories getAccessories() {
		return accessories;
	}

	public void setAccessories(Accessories accessories) {
		this.accessories = accessories;
	}
	
	@Override
	public String viewJewelWear() {
		System.out.println("A tear-like Jewel. Color Blue");
		
		return "A tear-like Jewel. Color Blue";
	}

	@Override
	public String viewPrice1() {
		System.out.println("Php 22,000.00");
		return "Php 22,000.00";
	}

}
