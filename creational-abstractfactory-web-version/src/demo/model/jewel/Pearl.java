package demo.model.jewel;

import demo.model.accessories.Accessories;

public class Pearl extends YashaJewel{
	
	private Accessories accessories;
	
	public Accessories getAccessories() {
		return accessories;
	}

	public void setAccessories(Accessories accessories) {
		this.accessories = accessories;
	}
	
	@Override
	public String viewJewelWear() {
		System.out.println("Jewel that can be found at the bottom of the Sea");
		
		return "Jewel that can be found at the bottom of the Sea";
	}

	@Override
	public String viewPrice1() {
		System.out.println("Php 12,000.00");
		return "Php 12,000.00";
	}

}
