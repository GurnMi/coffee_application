package kr.or.dgit.coffee_application.dto;

public class cInput {
	private String cNo;
	private int cPrice;
	private int Volume;
	private int Margin;
	
	public cInput() {
	}
	
	
	public cInput(String cNo, int cPrice, int volume, int margin) {
		this.cNo = cNo;
		this.cPrice = cPrice;
		Volume = volume;
		Margin = margin;
	}

	
	public cInput(String cNo) {
		this.cNo = cNo;
	}


	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	public int getVolume() {
		return Volume;
	}
	public void setVolume(int volume) {
		Volume = volume;
	}
	public int getMargin() {
		return Margin;
	}
	public void setMargin(int margin) {
		Margin = margin;
	}
	@Override
	public String toString() {
		return String.format("cInput [cNo=%s, cPrice=%s, Volume=%s, Margin=%s]", cNo, cPrice, Volume, Margin);
	}
	
	
	
}
