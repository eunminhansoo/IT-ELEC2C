package demo.model.top;

import demo.model.bottom.Bottom;

public class FormalMale extends YashaTop{
	
	private Bottom bottom;
	
	public Bottom getBottom() {
		return bottom;
	}

	public void setBottom(Bottom bottom) {
		this.bottom = bottom;
	}
	
	@Override
	public String  viewTopWear() {
		System.out.println("A perfect polo for attending a formal party");
		
		return "A perfect polo for attending a formal party";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 15,000.00");
		return "Php 15,000.00";
	}

}
