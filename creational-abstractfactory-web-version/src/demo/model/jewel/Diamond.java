package demo.model.jewel;

import demo.model.accessories.*;

public class Diamond extends YashaJewel {
	
	private Accessories accessories;
	
	@Override
	public String viewJewelWear() {
		System.out.println("Diamond, a perfect stone for a wedding proposal");
		
		return "Diamond, a perfect stone for a wedding proposal <br/> ";
	}
	
	@Override
	public String viewPrice1() {
		System.out.println("Php 100,000.00");
		return "Php 100,000.00";
	}

	public Accessories getAccessories() {
		return accessories;
	}

	public void setAccessories(Accessories accessories) {
		this.accessories = accessories;
	}


}
