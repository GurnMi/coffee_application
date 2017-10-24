package kr.or.dgit.coffee_application.content;

import javax.swing.JPanel;
import java.awt.GridLayout;
import kr.or.dgit.coffee_application.common.ComboComponent;
import kr.or.dgit.coffee_application.common.TextFieldComponent;
import kr.or.dgit.coffee_application.dto.Menu;

@SuppressWarnings("serial")
public class MenuContent2 extends JPanel {

	
	private TextFieldComponent cMenuNo;
	private TextFieldComponent cMenuName;

	public MenuContent2() {
		setLayout(new GridLayout(0, 1, 0, 10));
		
		cMenuNo = new TextFieldComponent("제품번호");
		add(cMenuNo);
		
		cMenuName = new TextFieldComponent("제품명");
		add(cMenuName);

	}
	
	public Menu getContent(){
		String cNo = cMenuNo.getTextValue();
		String cName = cMenuName.getTextValue();
		return new Menu(cNo, cName);
	}
	
	public void setContent(Menu menu){
		cMenuNo.setTextValue(menu.getcNo());
		cMenuName.setTextValue(menu.getcName());
	}
	
	public void isEmptyCheck() throws Exception{
		cMenuNo.isEmptyCheck();
		cMenuName.isEmptyCheck();
	}
	public void clear(){
		cMenuNo.setTextValue("");
		cMenuName.setTextValue("");
	}
	
}
