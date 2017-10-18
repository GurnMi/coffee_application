package kr.or.dgit.coffee_application.dto;

public class CInput {
	private String cNo;
	private String cName;
	private int cPrice;
	private int cVolume;
	private int cMargin;
	private int cAmount;
	public CInput() {
		// TODO Auto-generated constructor stub
	}
	public CInput(String cNo, String cName, int cPrice, int cVolume, int cMargin, int cAmount) {
		this.cNo = cNo;
		this.cName = cName;
		this.cPrice = cPrice;
		this.cVolume = cVolume;
		this.cMargin = cMargin;
		this.cAmount = cAmount;
	}
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcPrice() {
		return cPrice;
	}
	public void setcPrice(int cPrice) {
		this.cPrice = cPrice;
	}
	public int getcVolume() {
		return cVolume;
	}
	public void setcVolume(int cVolume) {
		this.cVolume = cVolume;
	}
	public int getcMargin() {
		return cMargin;
	}
	public void setcMargin(int cMargin) {
		this.cMargin = cMargin;
	}
	public int getcAmount() {
		return cAmount;
	}
	public void setcAmount(int cAmount) {
		this.cAmount = cAmount;
	}
	@Override
	public String toString() {
		return String.format("CInput [cNo=%s, cName=%s, cPrice=%s, cVolume=%s, cMargin=%s, cAmount=%s]", cNo, cName,
				cPrice, cVolume, cMargin, cAmount);
	}
	
	
}
