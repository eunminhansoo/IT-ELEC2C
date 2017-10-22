package demo.utility;

import demo.model.bottom.*;
import demo.model.top.*;
import demo.model.accessories.*;
import demo.model.jewel.*;

public interface AbstractFactory {
	
	YashaTop getTop(String input);
	Bottom getBottom(String name);
	YashaJewel getJewel(String input1);
	Accessories getAccessories(String name1);

}
