package demo.utility;

import demo.model.top.*;
import demo.model.accessories.*;
import demo.model.bottom.*;
import demo.model.jewel.*;

public class TopFactory implements AbstractFactory {

	public YashaTop getTop(String input) {
		//type of object that will be returned
		YashaTop top = null;
		
		/*
		 when creating the factory method, the return
		 type of the method is always your common
		 superclass. The creation of the object is based
		 on the value of the String content.
		 */
		
		switch(input) {
		/*
		 To complete the factory method, the 
		 object conversion is upcasting - the data
		 type on the right(child) (when looking
		 at the code) is always smaller than the 
		 data type on the left(parent). 
		 */
		case "SUMMER":
			top = new Summer();
			break;
		case "FORMAL MALE":
			top = new FormalMale();
			break;
		case "FORMAL FEMALE":
			top = new FormalFemale();
			break;
		case "GYM":
			top = new Gym();
			break;
		case "CASUAL":
			top = new Casual();
			break;
	}
	return top;
}

	
	
	@Override
	public Bottom getBottom(String name) {
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
