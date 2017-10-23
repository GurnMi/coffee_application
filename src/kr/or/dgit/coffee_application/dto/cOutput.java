package kr.or.dgit.coffee_application.dto;

public class cOutput {
		private int crank;
		private String cNo;
		private String cName;
		private int cPrice;
		private int Volume;
		private int Supply;
		private int tax;
		private int Amount;
		private int Margin;
		private int MarginPrice;
		public cOutput() {
			super();
			// TODO Auto-generated constructor stub
		}
		public cOutput(int crank, String cNo, String cName, int cPrice, int volume, int supply, int tax, int amount,
				int margin, int marginPrice) {
			super();
			this.crank = crank;
			this.cNo = cNo;
			this.cName = cName;
			this.cPrice = cPrice;
			Volume = volume;
			Supply = supply;
			this.tax = tax;
			Amount = amount;
			Margin = margin;
			MarginPrice = marginPrice;
		}
		public int getCrank() {
			return crank;
		}
		public void setCrank(int crank) {
			this.crank = crank;
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
		public int getVolume() {
			return Volume;
		}
		public void setVolume(int volume) {
			Volume = volume;
		}
		public int getSupply() {
			return Supply;
		}
		public void setSupply(int supply) {
			Supply = supply;
		}
		public int getTax() {
			return tax;
		}
		public void setTax(int tax) {
			this.tax = tax;
		}
		public int getAmount() {
			return Amount;
		}
		public void setAmount(int amount) {
			Amount = amount;
		}
		public int getMargin() {
			return Margin;
		}
		public void setMargin(int margin) {
			Margin = margin;
		}
		public int getMarginPrice() {
			return MarginPrice;
		}
		public void setMarginPrice(int marginPrice) {
			MarginPrice = marginPrice;
		}
		@Override
		public String toString() {
			return "cOutput [crank=" + crank + ", cNo=" + cNo + ", cName=" + cName + ", cPrice=" + cPrice + ", Volume="
					+ Volume + ", Supply=" + Supply + ", tax=" + tax + ", Amount=" + Amount + ", Margin=" + Margin
					+ ", MarginPrice=" + MarginPrice + "]";
		}
		
		
	   
}
