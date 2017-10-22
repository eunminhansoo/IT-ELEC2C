package demo.utility;

import demo.model.top.*;
import demo.model.accessories.*;
import demo.model.bottom.*;
import demo.model.jewel.*;

public class JewelFactory implements AbstractFactory {

	public YashaJewel getJewel(String input1) {
		//type of object that will be returned
		YashaJewel jewel = null;
		
		/*
		 when creating the factory method, the return
		 type of the method is always your common
		 superclass. The creation of the object is based
		 on the value of the String content.
		 */
		
		switch(input1) {
		/*
		 To complete the factory method, the 
		 object conversion is upcasting - the data
		 type on the right(child) (when looking
		 at the code) is always smaller than the 
		 data type on the left(parent). 
		 */
		case "DIAMOND":
			jewel = new Diamond();
			break;
		case "EMERALD":
			jewel = new Emerald();
			break;
		case "PEARL":
			jewel = new Pearl();
			break;
		case "RUBY":
			jewel = new Ruby();
			break;
		case "SAPPHIRE":
			jewel = new Sapphire();
			break;
	}
	return jewel;
}

	
	
	@Override
	public Bottom getBottom(String name) {
		return null;
	}
	
	@Override
	public YashaTop getTop(String input) {
		return null;
	}
	
	@Override
	public Accessories getAccessories(String name1) {
		return null;
	}

}
