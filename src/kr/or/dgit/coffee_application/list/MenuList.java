package kr.or.dgit.coffee_application.list;

import java.util.List;

import javax.swing.SwingConstants;

import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.service.MenuService;

public class MenuList extends AbstractList {
	
	private MenuService service;
	
	
	
	public MenuList(MenuService service) {
		this.service = service;
	}

	public MenuList() {
		
	}

	@Override
	protected void setAlighWidth() {
		setAlign(SwingConstants.CENTER, 0,1);
		setCellWidth(100,150);
	}

	@Override
	protected Object[][] getData() {
		List<Menu> lists = service.selectMenuByAll();
		Object[][] datas = new Object[lists.size()][];
		for(int i=0; i<lists.size();i++){
			datas[i] = lists.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected String[] getColumnNames() {
		return new String[] {"제품번호","제품명"};
	}

	@Override
	public Object getSelectedItem() {
		int seletedIndex = table.getSelectedRow();
		String cNo = (String) table.getValueAt(seletedIndex, 0);
		return service.selectMenuByNo(new Menu(cNo));
	}

}
