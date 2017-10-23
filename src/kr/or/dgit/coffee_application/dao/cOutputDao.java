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
		String sql = "select cNo, cPrice, volume, supply, tax, amount, margin, marginPrice where cno=?";
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
		String cNo = rs.getString(1);
		int cPrice = rs.getInt(2);
		int volume = rs.getInt(3);
		int supply = rs.getInt(4);
		int tax = rs.getInt(5);
		int amount = rs.getInt(6);
		int margin = rs.getInt(7);
		int marginPrice = rs.getInt(8);
		return new cOutput(cNo, cPrice, volume, supply, tax, amount, margin, marginPrice);
	}
	

	@Override
	public List<cOutput> selectItemByAll() throws SQLException {
		List<cOutput> lists = new ArrayList();
		String sql = "select cNo, cPrice, volume, supply, tax, amount, margin, marginPrice from cOutput";
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();){
				while(rs.next()){
					lists.add(getoutput(rs));
				}
			}
		
		return lists;
	}
	
	public List<cOutput> resultSupply() throws SQLException {
		List<cOutput> lists = new ArrayList();
		/*String sql = "create view result1 "
				+"as select (select count(*)+1 from coutput where Supply>o.Supply)  as crank,"
				+"o.cNo, cName, cPrice, volume, Supply, tax, Amount,Margin, MarginPrice "
				+"from cOutput o join menu m on o.cNo = m.cNo order by Supply desc";*/
		String sql1 ="select cNo, cName, cPrice, volume, Supply, tax, Amount,Margin, MarginPrice from result1";
		
		
		try(PreparedStatement pstmt = DBCon.getInstance().getConnection().prepareStatement(sql1);
				ResultSet rs = pstmt.executeQuery();){
				while(rs.next()){
					lists.add(getoutput(rs));
				}
			}
		
		return lists;
	}

}
