package kr.or.dgit.coffee_application.service;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import kr.or.dgit.coffee_application.dao.SqlDao;
import kr.or.dgit.coffee_application.dao.cOutputDao;
import kr.or.dgit.coffee_application.dto.cInput;
import kr.or.dgit.coffee_application.dto.cOutput;

public class cOutputService {
	private cOutputDao coutputDao;

	public cOutputService() {
		coutputDao = cOutputDao.getInstance();
	}

	private void showMessage(String string) {
		JOptionPane.showMessageDialog(null, string);
	}
	
	public cOutput selectcOutputByNo(cOutput coutput){
		try {
			return coutputDao.selectItemByNo(coutput);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public cOutput selectcOutputByNoM(cOutput coutput){
		try {
			return coutputDao.selectItemByNoM(coutput);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}
	
	public List<cOutput> selectcOutputByAll(){
		try {
			return coutputDao.selectItemByAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public List<cOutput> selectcOutputByAllM(){
		try {
			return coutputDao.selectItemByAllM();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
