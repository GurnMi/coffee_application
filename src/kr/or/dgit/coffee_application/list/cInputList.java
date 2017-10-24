package kr.or.dgit.coffee_application.list;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.dto.cInput;
import kr.or.dgit.coffee_application.list.AbstractList;
import kr.or.dgit.coffee_application.service.cInputService;

public class cInputList extends AbstractList {
	
	private cInputService service;
	
	
	
	public cInputList(cInputService service) {
		this.service = service;
	}

	public cInputList() {

	}

	@Override
	protected void setAlighWidth() {
		setAlign(SwingConstants.CENTER, 0,1);
		setCellWidth(100,150);
	}

	@Override
	protected Object[][] getData() {
		List<cInput> lists = service.selectcInputByAll();
		Object[][] datas = new Object[lists.size()][];
		for(int i=0; i<lists.size();i++){
			datas[i] = lists.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected String[] getColumnNames() {
		return new String[] {"제품번호","제품가격", "판매수량", "마진율"};
	}

	@Override
	public Object getSelectedItem() {
		int seletedIndex = table.getSelectedRow();
		String cNo = (String) table.getValueAt(seletedIndex, 0);
		return service.selectcInputByNo(new cInput(cNo));
	}

}
