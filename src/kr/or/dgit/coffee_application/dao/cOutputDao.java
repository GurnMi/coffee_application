package kr.or.dgit.coffee_application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.coffee_application.dto.cOutput;
import kr.or.dgit.coffee_application.jdbc.DBCon;

public class cOutputDao implements SqlDao<cOutput> {
	private static final cOutputDao Instance = new cOutputDao();
	
	public static cOutputDao getInstance() {
		return Instance;
	}

	public cOutputDao() {}

	@Override
	public int insertItem(cOutput item) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteItem(cOutput item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateItem(cOutput item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public cOutput selectItemByNo(cOutput item) throws SQLException {
		String sql = "select crank, cNo,cName, cPrice, volume, supply, tax, amount, margin, marginPrice from result1 where cno=?";
		cOutput output = null;
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			
			try(ResultSet rs =  pstmt.executeQuery();){
				if(rs.next()){
					output = getoutput(rs);
				}
			}
		}	
		return output;
	}
	
	public cOutput selectItemByNoM(cOutput item) throws SQLException {
		String sql = "select crank, cNo,cName, cPrice, volume, supply, tax, amount, margin, marginPrice from result2 where cno=?";
		cOutput output = null;
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			
			try(ResultSet rs =  pstmt.executeQuery();){
				if(rs.next()){
					output = getoutput(rs);
				}
			}
		}	
		return output;
	}

	private cOutput getoutput(ResultSet rs) throws SQLException {
		int crank = rs.getInt(1);
		String cNo = rs.getString(2);
		String cName = rs.getString(3);
		int cPrice = rs.getInt(4);
		int volume = rs.getInt(5);
		int supply = rs.getInt(6);
		int tax = rs.getInt(7);
		int amount = rs.getInt(8);
		int margin = rs.getInt(9);
		int marginPrice = rs.getInt(10);
		return new cOutput(crank, cNo,cName, cPrice, volume, supply, tax, amount, margin, marginPrice);
	}
	

	@Override
	public List<cOutput> selectItemByAll() throws SQLException {
		List<cOutput> lists = new ArrayList();
		String sql = "select crank, cNo,cName, cPrice, volume, supply, tax, amount, margin, marginPrice from result1";
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
				while(rs.next()){
					lists.add(getoutput(rs));
				}
			}
		return lists;
	}
	
	public List<cOutput> selectItemByAllM() throws SQLException {
		List<cOutput> lists = new ArrayList();
		String sql = "select crank, cNo,cName, cPrice, volume, supply, tax, amount, margin, marginPrice from result2";
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
				while(rs.next()){
					lists.add(getoutput(rs));
				}
			}
		return lists;
	}

}
