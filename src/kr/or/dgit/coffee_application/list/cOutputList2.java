package kr.or.dgit.coffee_application.list;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import kr.or.dgit.coffee_application.dto.cInput;
import kr.or.dgit.coffee_application.dto.cOutput;
import kr.or.dgit.coffee_application.list.AbstractList;
import kr.or.dgit.coffee_application.service.cOutputService;

public class cOutputList2 extends AbstractList {
	
	private cOutputService service;
	
	public cOutputList2(cOutputService service) {
		this.service = service;
	}

	public cOutputList2() {

	}

	@Override
	protected void setAlighWidth() {
		setAlign(SwingConstants.CENTER, 0,1);
		setCellWidth(100,150);
	}

	@Override
	protected Object[][] getData() {
		List<cOutput> lists = service.selectcOutputByAllM();
		Object[][] datas = new Object[lists.size()][];
		for(int i=0; i<lists.size();i++){
			datas[i] = lists.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected String[] getColumnNames() {
		return new String[] {"순위", "제품코드","제품명","제품단가","판매수량","공급가액","부가세액","판매금액","마진율","마진액"};
	}

	@Override
	public Object getSelectedItem() {
		int seletedIndex = table.getSelectedRow();
		String cNo = (String) table.getValueAt(seletedIndex, 0);
		return service.selectcOutputByNoM(new cOutput(cNo));
	}

}
