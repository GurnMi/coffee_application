package kr.or.dgit.coffee_application.content;

import java.awt.GridLayout;

import kr.or.dgit.coffee_application.common.TextFieldComponent;
import kr.or.dgit.coffee_application.dto.cInput;

public class cInputContent extends AbstractContent<cInput> {

	private TextFieldComponent cInputNo;
	private TextFieldComponent cInputPrice;
	private TextFieldComponent cInputVolume;
	private TextFieldComponent cInputMargin;


	public cInputContent() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		cInputNo = new TextFieldComponent("제품코드");
		add(cInputNo);
		
		cInputPrice = new TextFieldComponent("제품단가");
		add(cInputPrice);
		
		cInputVolume = new TextFieldComponent("판매수량");
		add(cInputVolume);
		
		cInputMargin = new TextFieldComponent("마진율");
		add(cInputMargin);
	}

	@Override
	public cInput getContent() {
		String cNo = cInputNo.getTextValue();

		int cPrice = Integer.parseInt(cInputPrice.getTextValue());
		int volume = Integer.parseInt(cInputVolume.getTextValue());
		int margin = Integer.parseInt(cInputMargin.getTextValue());
		return new cInput(cNo, cPrice, volume, margin);
		
		//System.out.println(cInputPrice.getTextValue());
	}

	@Override
	public void setContent(cInput cinput) {
		cInputNo.setTextValue(cinput.getcNo());
		cInputPrice.setTextValue(cinput.getcPrice()+"");
		cInputVolume.setTextValue(cinput.getVolume()+"");
		cInputMargin.setTextValue(cinput.getMargin()+"");
	}

	@Override
	public void isEmptyCheck() throws Exception {
		cInputNo.isEmptyCheck();
		cInputPrice.isEmptyCheck();
		cInputVolume.isEmptyCheck();
		cInputMargin.isEmptyCheck();
	}

	@Override
	public void clear() {
		cInputNo.setTextValue("");
		cInputPrice.setTextValue("");
		cInputVolume.setTextValue("");
		cInputMargin.setTextValue("");
	}

}
