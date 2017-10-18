package kr.or.dgit.coffee_application;

import java.sql.Connection;

import kr.or.dgit.coffee_application.jdbc.DBCon;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testDBCon();
	}
	
	
	private static void testDBCon(){
		DBCon dbCon = DBCon.getInstance();
		Connection connection = dbCon.getConnection();
		System.out.println(connection);
	}
	

}
