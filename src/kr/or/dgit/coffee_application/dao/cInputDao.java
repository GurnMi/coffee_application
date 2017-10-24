package kr.or.dgit.coffee_application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.dto.cInput;
import kr.or.dgit.coffee_application.jdbc.DBCon;

public class cInputDao implements SqlDao<cInput> {
	private static final cInputDao Instance = new cInputDao();
	
	
	public static cInputDao getInstance() {
		return Instance;
	}

	public cInputDao() {}

	@Override
	public int insertItem(cInput item) throws SQLException {
		String sql = "insert into cInput values(?,?,?,?)";
		Connection con = DBCon.getInstance().getConnection();	
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			pstmt.setInt(2, item.getcPrice());
			pstmt.setInt(3, item.getVolume());
			pstmt.setInt(4, item.getMargin());
			return pstmt.executeUpdate();
		}
	}
	
	

	@Override
	public void deleteItem(cInput item) throws SQLException {
		String sql = "delete from cInput where cno =?";
		Connection con = DBCon.getInstance().getConnection();
		
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			
			pstmt.executeUpdate();
		}
	}

	@Override
	public void updateItem(cInput item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public cInput selectItemByNo(cInput item) throws SQLException {
		String sql ="select cNo, cPrice, volume, Margin from cInput where cno=?";
		cInput cinput = null;
		
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			
			try(ResultSet rs =  pstmt.executeQuery();){
				if(rs.next()){
					cinput = getcInput(rs);
				}
			}
		}
		return cinput;
	}

	private cInput getcInput(ResultSet rs) throws SQLException {
		String cNo = rs.getString(1);
		int cPrice = rs.getInt(2);
		int volume = rs.getInt(3);
		int margin = rs.getInt(4);
		return new cInput(cNo, cPrice, volume, margin);
	}

	@Override
	public List<cInput> selectItemByAll() throws SQLException {
		List<cInput> lists = new ArrayList<>();
		String sql ="select cNo, cPrice, volume, Margin from cInput";
		
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();){
			while(rs.next()){
				lists.add(getcInput(rs));
			}
		}
		return lists;
	}

	

}
