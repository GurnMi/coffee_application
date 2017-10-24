package kr.or.dgit.coffee_application.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import kr.or.dgit.coffee_application.content.AbstractContent;
import kr.or.dgit.coffee_application.content.MenuContent;
import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.list.AbstractList;
import kr.or.dgit.coffee_application.list.MenuList;
import kr.or.dgit.coffee_application.service.MenuService;

@SuppressWarnings("serial")
public class ViewMenu extends AbstractView {

	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenu frame = new ViewMenu("메뉴");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	
	
	private MenuService service;
	
	public ViewMenu(String menu) {
		super(menu);
	}

	
	@Override
	protected void createService() {
		service = new MenuService();
	}


	@Override
	protected AbstractList createList() {
		pList = new MenuList(service);
		pList.loadData();
		return pList;
	}

	@Override
	protected void insertContent(Object content) {
		service.inserMenu((Menu) content);
	}

	@Override
	protected void deleteContent(Object item) {
		service.deleteMenu((Menu)item);
	}

	@Override
	protected void setContent(Object content) {
	}

	@Override
	protected AbstractContent<Menu> createContent() {
		pContent = new MenuContent();
		return (AbstractContent<Menu>) pContent;
	}




	
}
