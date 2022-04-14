package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.dto.TestDTO;

public class TestDAO {
	
	@Autowired
	DataSource dataSource;
	// 드라이버 로딩, 커넥션 연결 후 받아서 사용하게 됨
	
	public TestDAO() {
		
	}

	public ArrayList<TestDTO> select() {
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = dataSource.getConnection();
			System.out.println("db접속 성공 : " + con);

			String sql = "SELECT * FROM test";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num =  rs.getInt(1);
				String username = rs.getString(2);
				String address = rs.getString(3);
				// System.out.println(num + "\t" + username + "\t" + address);
				TestDTO dto = new TestDTO(num, username, address);
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null)	rs.close();
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
		
	}

	public void delete(int i) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = dataSource.getConnection();

			String sql = "delete from test where num = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			
			int n  = pstmt.executeUpdate();
			// dbcp2는 auto commit

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null)	pstmt.close();
				if(con != null)	con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void insert(int num, String name, String address){
		
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  
		  try{
			  con = 
					  dataSource.getConnection();//수정됨
			  String sql ="insert into test (num, username,address) "
			  		+ " values ( ? , ? , ? )" ;
			  pstmt = con.prepareStatement(sql);
			  pstmt.setInt(1, num);
			  pstmt.setString(2, name);
			  pstmt.setString(3, address);
			  //insert, delete, update 은 executeUpdate()	
			  int n = pstmt.executeUpdate();
		 
		  }catch(Exception e){
			  e.printStackTrace();
		  }finally{
			  try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
	}//end insert


	// num에 해당하는 레코드 수정
	public void update(int num, String name, String address){
		Connection con = null;
		PreparedStatement pstmt = null;
				  
		try{
			con = dataSource.getConnection();// 수정됨
			String sql ="update test set username =?, address= ? where num = ?" ;
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(3, num);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			  //insert, delete, update 은 executeUpdate()	
			int n = pstmt.executeUpdate();
			 
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
