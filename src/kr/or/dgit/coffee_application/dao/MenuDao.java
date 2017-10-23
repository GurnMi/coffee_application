package kr.or.dgit.coffee_application.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.dgit.coffee_application.dto.Menu;
import kr.or.dgit.coffee_application.jdbc.DBCon;

public class MenuDao implements SqlDao<Menu> {
	private static final MenuDao Instance = new MenuDao();
	
	
	public static MenuDao getInstance() {
		return Instance;
	}

	public MenuDao() {}

	@Override
	public int insertItem(Menu item) throws SQLException {
		String sql = "INSERT INTO MENU VALUES(?,?)";
		Connection con = DBCon.getInstance().getConnection();
		
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			pstmt.setString(2, item.getcName());
			return pstmt.executeUpdate();
		}
	}

	@Override
	public void deleteItem(Menu item) throws SQLException {
		String sql = "delete from menu where cno =?";
		Connection con = DBCon.getInstance().getConnection();
		
		try(PreparedStatement pstmt = con.prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			
			pstmt.executeUpdate();
		}
	}

	@Override
	public void updateItem(Menu item) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Menu selectItemByNo(Menu item) throws SQLException {
		String sql ="select cNo, cName from menu where cno=?";
		Menu menu = null;
		
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);){
			pstmt.setString(1, item.getcNo());
			
			try(ResultSet rs =  pstmt.executeQuery();){
				if(rs.next()){
					menu = getMenu(rs);
				}
			}
		}
		return menu;
		
	}

	private Menu getMenu(ResultSet rs) throws SQLException {
		String cNo = rs.getString(1);
		String cName = rs.getString(2);
		return new Menu(cNo, cName);
	}

	@Override
	public List<Menu> selectItemByAll() throws SQLException {
		List<Menu> lists = new ArrayList<>();
		String sql ="select cNo, cName from menu";
		
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();){
			while(rs.next()){
				lists.add(getMenu(rs));
			}
		}
		return lists;
	}
}
