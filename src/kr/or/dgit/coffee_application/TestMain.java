package kr.or.dgit.coffee_application;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import kr.or.dgit.coffee_application.dao.MenuDao;
import kr.or.dgit.coffee_application.dao.cInputDao;
import kr.or.dgit.coffee_application.dao.cOutputDao;
import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.dto.cInput;
import kr.or.dgit.coffee_application.dto.cOutput;
import kr.or.dgit.coffee_application.jdbc.DBCon;

public class TestMain {

	public static void main(String[] args) {
		//testDBCon();
		
		Menu m1 = new Menu("A001","아메리카노");
		Menu m2 = new Menu("A001");
		
		//insertMenu(m1);
		
		//deleteMenu(m2);
		
		//ListAllMenu();
		
		//searchMenu(m2);
		
		cInput input = new cInput("A001", 4500, 150, 10);
		cInput input1 = new cInput("A001");
		
		/*insertcInput(input);
		
		deletecInput(input1);*/
		
		//ListAllcInput();
		
		
		//searchcInput(input1);
		
		//ListAllcOutput();
		
		/*try {
			cInputDao.getInstance().trigger();
			System.out.println("트리거 생성완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		try {
			List<cOutput> lists = cOutputDao.getInstance().resultSupply();
			for(cOutput m:lists){
				System.out.println(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	private static void ListAllcOutput() {
		try {
			List<cOutput> lists = cOutputDao.getInstance().selectItemByAll();
			for(cOutput m:lists){
				System.out.println(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void searchcInput(cInput input1) {
		try {
			cInput searchcInput = cInputDao.getInstance().selectItemByNo(input1);
			System.out.println(searchcInput);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	private static void ListAllcInput() {
		try {
			List<cInput> lists = cInputDao.getInstance().selectItemByAll();
			for(cInput m:lists){
				System.out.println(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void deletecInput(cInput input1) {
		try {
			cInputDao.getInstance().deleteItem(input1);
			JOptionPane.showMessageDialog(null, "제품코드 삭제되었습니다.");
		} catch (SQLException e) {
			System.err.printf("%s - %s%n", e.getErrorCode(), e.getMessage());
			if(e.getErrorCode()==1062){
				JOptionPane.showMessageDialog(null, "제품코드가 없음");
			}
		}
	}


	private static void insertcInput(cInput input) {
		try {
			cInputDao.getInstance().insertItem(input);
			JOptionPane.showMessageDialog(null, "입력되었습니다.");
		} catch (SQLException e) {
			System.err.printf("%s - %s%n", e.getErrorCode(), e.getMessage());
			if(e.getErrorCode()==1062){
				JOptionPane.showMessageDialog(null, "코드번호가 중복");
			}
		}
	}


	private static void searchMenu(Menu m2) {
		try {
			Menu searchMenu = MenuDao.getInstance().selectItemByNo(m2);
			System.out.println(searchMenu);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	private static void ListAllMenu() {
		try {
			List<Menu> lists = MenuDao.getInstance().selectItemByAll();
			for(Menu m:lists){
				System.out.println(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static void deleteMenu(Menu m2) {
		try {
			MenuDao.getInstance().deleteItem(m2);
			JOptionPane.showMessageDialog(null, "제품코드 삭제되었습니다.");
		} catch (SQLException e) {
			System.err.printf("%s - %s%n", e.getErrorCode(), e.getMessage());
			if(e.getErrorCode()==1062){
				JOptionPane.showMessageDialog(null, "제품코드가 없음");
			}
		}
	}


	private static void insertMenu(Menu m1) {
		try {
			MenuDao.getInstance().insertItem(m1);
			JOptionPane.showMessageDialog(null, "제품코드, 제품명이 입력되었습니다.");
		} catch (SQLException e) {
			System.err.printf("%s - %s%n", e.getErrorCode(), e.getMessage());
			if(e.getErrorCode()==1062){
				JOptionPane.showMessageDialog(null, "직책번호가 중복");
			}
		}
	}
	
	
	private static void testDBCon(){
		DBCon dbCon = DBCon.getInstance();
		Connection connection = dbCon.getConnection();
		System.out.println(connection);
		
		
	}
	

}
