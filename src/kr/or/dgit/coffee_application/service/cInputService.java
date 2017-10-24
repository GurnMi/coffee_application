package kr.or.dgit.coffee_application.service;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import kr.or.dgit.coffee_application.dao.SqlDao;
import kr.or.dgit.coffee_application.dao.cInputDao;
import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.dto.cInput;

public class cInputService {
	private SqlDao<cInput> cinputDao;

	public cInputService() {
		cinputDao = cInputDao.getInstance();
	}
	
	public void insertcInput(cInput cinput){
		try {
			cinputDao.insertItem(cinput);
			showMessage("추가완료");
		} catch (SQLException e) {
			e.printStackTrace();
			showMessage(e.getMessage());
		}
	}

	private void showMessage(String string) {
		JOptionPane.showMessageDialog(null, string);
	}
	
	public void deletecInput(cInput cinput){
		try {
			cinputDao.deleteItem(cinput);
			showMessage("삭제완료");
		} catch (SQLException e) {
			e.printStackTrace();
			showMessage(e.getMessage());
		}		
	}
	
	public cInput selectcInputByNo(cInput cinput){
		try {
			return cinputDao.selectItemByNo(cinput);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public List<cInput> selectcInputByAll(){
		try {
			return cinputDao.selectItemByAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
