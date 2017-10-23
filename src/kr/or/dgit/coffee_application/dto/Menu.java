package kr.or.dgit.coffee_application.dto;

public class Menu {
	private String cNo;
	private String cName;
	public Menu(String cNo, String cName) {
		this.cNo = cNo;
		this.cName = cName;
	}
	
	public Menu(String cNo) {
		this.cNo = cNo;
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
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public String toString() {
		return String.format("Menu [cNo=%s, cName=%s]", cNo, cName);
	}
	*/
	@Override
	public String toString() {
		return String.format("%s, %s", cNo, cName);
	}
	
}
