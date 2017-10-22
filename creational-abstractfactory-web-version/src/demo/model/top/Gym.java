package demo.model.top;

import demo.model.bottom.Bottom;

public class Gym extends YashaTop{
	
	private Bottom bottom;
	
	public Bottom getBottom() {
		return bottom;
	}

	public void setBottom(Bottom bottom) {
		this.bottom = bottom;
	}
	
	@Override
	public String  viewTopWear() {
		System.out.println("Fitted Tank to show off your muscles");
		
		return "Fitted Tank to show off your muscles";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 4,000.00");
		return "Php 4,000.00";
	}
	

}
