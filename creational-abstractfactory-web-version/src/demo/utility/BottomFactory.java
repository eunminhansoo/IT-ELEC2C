package demo.utility;

import demo.model.bottom.Bottom;
import demo.model.bottom.Jeans;
import demo.model.bottom.Pants;
import demo.model.bottom.Shorts;
import demo.model.bottom.Skirt;
import demo.model.bottom.Sweatpants;
import demo.model.top.YashaTop;
import demo.model.accessories.Accessories;
import demo.model.jewel.YashaJewel;

public class BottomFactory implements AbstractFactory {
	
	public Bottom getBottom(String name) {
		Bottom bottom = null;
		
		if(name.equalsIgnoreCase("SUMMER")) {
			bottom = new Shorts();
		} else if (name.equalsIgnoreCase("FORMAL FEMALE")) {
			bottom = new Skirt();
		} else if(name.equalsIgnoreCase("FORMAL MALE"))  {
			bottom = new Pants();
		} else if(name.equalsIgnoreCase("GYM")) {
			bottom = new Sweatpants();
		} else if(name.equalsIgnoreCase("CASUAL")) {
			bottom = new Jeans();
		} 
		return bottom;
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
	public Accessories getAccessories(String name1) {
		return null;
	}

}
