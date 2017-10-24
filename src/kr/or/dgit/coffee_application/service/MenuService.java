package kr.or.dgit.coffee_application.service;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import kr.or.dgit.coffee_application.dao.MenuDao;
import kr.or.dgit.coffee_application.dao.SqlDao;
import kr.or.dgit.coffee_application.dto.Menu;

public class MenuService {
	private SqlDao<Menu> menuDao;

	public MenuService() {
		menuDao = MenuDao.getInstance();
	}
	
	public void inserMenu(Menu menu){
		try {
			menuDao.insertItem(menu);
			showMessage("추가완료");
		} catch (SQLException e) {
			e.printStackTrace();
			showMessage(e.getMessage());
		}
	}

	private void showMessage(String string) {
		JOptionPane.showMessageDialog(null, string);
	}
	
	
	public void deleteMenu(Menu menu){
		try {
			menuDao.deleteItem(menu);
			showMessage("삭제완료");
		} catch (SQLException e) {
			e.printStackTrace();
			showMessage(e.getMessage());
		}		
	}
	
	public Menu selectMenuByNo(Menu menu){
		try {
			return menuDao.selectItemByNo(menu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public List<Menu> selectMenuByAll(){
		try {
			return menuDao.selectItemByAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
