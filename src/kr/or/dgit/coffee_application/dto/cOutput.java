package kr.or.dgit.coffee_application.dto;

public class cOutput {
		private String cNo;
		private int cPrice;
		private int Volume;
		private int Supply;
		private int tax;
		private int Amount;
		private int Margin;
		private int MarginPrice;
		
		public cOutput() {
			// TODO Auto-generated constructor stub
		}

		public cOutput(String cNo, int cPrice, int volume, int supply, int tax, int amount, int margin,
				int marginPrice) {
			this.cNo = cNo;
			this.cPrice = cPrice;
			Volume = volume;
			Supply = supply;
			this.tax = tax;
			Amount = amount;
			Margin = margin;
			MarginPrice = marginPrice;
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
			return String.format(
					"cOutput [cNo=%s, cPrice=%s, Volume=%s, Supply=%s, tax=%s, Amount=%s, Margin=%s, MarginPrice=%s]",
					cNo, cPrice, Volume, Supply, tax, Amount, Margin, MarginPrice);
		}

		
		
	   
}
