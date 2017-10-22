package demo.model.jewel;

import demo.model.accessories.Accessories;

public class Ruby extends YashaJewel{
	
	private Accessories accessories;
	
	public Accessories getAccessories() {
		return accessories;
	}

	public void setAccessories(Accessories accessories) {
		this.accessories = accessories;
	}
	
	@Override
	public String viewJewelWear() {
		System.out.println("A jewel that depicts the color of Blood");
		
		return "A jewel that depicts the color of Blood";
	}

	@Override
	public String viewPrice1() {
		System.out.println("Php 18,000.00");
		return "Php 18,000.00";
	}

}
