package demo.model.top;

import demo.model.bottom.Bottom;

public class FormalFemale extends YashaTop{
	
	private Bottom bottom;
	
	public Bottom getBottom() {
		return bottom;
	}

	public void setBottom(Bottom bottom) {
		this.bottom = bottom;
	}
	
	@Override
	public String  viewTopWear() {
		System.out.println("Wear this dress to impress");
		
		return "Wear this dress to impress";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 50,000.00");
		return "Php 50,000.00";
	}

}
