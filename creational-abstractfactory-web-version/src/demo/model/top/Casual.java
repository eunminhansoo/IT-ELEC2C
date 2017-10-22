package demo.model.top;

import demo.model.bottom.*;

public class Casual extends YashaTop {
	
	private Bottom bottom;
	
	@Override
	public String viewTopWear() {
		System.out.println("Unisex Casual Shirt from Zara");
		
		return "Unisex Casual Shirt from Zara <br/> ";
	}
	
	@Override
	public String viewPrice() {
		System.out.println("Php 7,000.00");
		return "Php 7,000.00";
	}

	public Bottom getBottom() {
		return bottom;
	}

	public void setBottom(Bottom bottom) {
		this.bottom = bottom;
	}

}
