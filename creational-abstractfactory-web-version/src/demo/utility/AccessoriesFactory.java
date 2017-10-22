package demo.utility;

import demo.model.accessories.Accessories;
import demo.model.top.YashaTop;
import demo.model.jewel.YashaJewel;
import demo.model.bottom.Bottom;
import demo.model.accessories.Bracelet;
import demo.model.accessories.Earrings;
import demo.model.accessories.Necklace;
import demo.model.accessories.Ring;
import demo.model.accessories.Watch;

public class AccessoriesFactory implements AbstractFactory {
	
	public Accessories getAccessories(String name1) {
		Accessories accessories = null;
		
		if(name1.equalsIgnoreCase("BRACELET")) {
			accessories = new Bracelet();
		} else if (name1.equalsIgnoreCase("EARRINGS")) {
			accessories = new Earrings();
		} else if(name1.equalsIgnoreCase("NECKLACE"))  {
			accessories = new Necklace();
		} else if(name1.equalsIgnoreCase("RING")) {
			accessories = new Ring();
		} else if(name1.equalsIgnoreCase("WATCH")) {
			accessories = new Watch();
		} 
		return accessories;
	}
	

	@Override
	public YashaTop getTop(String input) {
		return null;
	}
	
	@Override
	public YashaJewel getJewel(String input1) {
		return null;
	}
	
	@Override
	public Bottom getBottom(String name) {
		return null;
	}

}
