package demo.model.top;

import demo.model.bottom.Bottom;

public class Summer extends YashaTop{
	
	private Bottom bottom;
	
	public Bottom getBottom() {
		return bottom;
	}

	public void setBottom(Bottom bottom) {
		this.bottom = bottom;
	}
	
	@Override
	public String  viewTopWear() {
		System.out.println("A shirt imported from Hawaii");
		
		return "A shirt imported from Hawaii";
	}

	@Override
	public String viewPrice() {
		System.out.println("Php 2,000.00");
		return "Php 2,000.00";
	}

}
