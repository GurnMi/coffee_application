package kr.or.dgit.coffee_application.content;

import javax.swing.JPanel;

import kr.or.dgit.coffee_application.dto.Menu;
import java.awt.GridLayout;
import kr.or.dgit.coffee_application.common.TextFieldComponent;

public class MenuContent extends AbstractContent<Menu> {

	
	private TextFieldComponent cMenuNo;
	private TextFieldComponent cMenuName;

	public MenuContent() {
		setLayout(new GridLayout(0, 1, 10, 10));
		
		cMenuNo = new TextFieldComponent("제품번호");
		add(cMenuNo);
		
		cMenuName = new TextFieldComponent("제품명");
		add(cMenuName);

	}
	
	@Override
	public Menu getContent(){
		String cNo = cMenuNo.getTextValue();
		String cName = cMenuName.getTextValue();
		return new Menu(cNo, cName);
	}
	@Override
	public void setContent(Menu menu){
		cMenuNo.setTextValue(menu.getcNo());
		cMenuName.setTextValue(menu.getcName());
	}
	@Override
	public void isEmptyCheck() throws Exception{
		cMenuNo.isEmptyCheck();
		cMenuName.isEmptyCheck();
	}
	@Override
	public void clear(){
		cMenuNo.setTextValue("");
		cMenuName.setTextValue("");
	}
	
}
