import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestDAO {
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	
	public TestDAO() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<TestDTO> select() {
		ArrayList<TestDTO> list = new ArrayList<TestDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, userid, passwd);
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
	
	public void insert(int num, String name, String address){
		
		  Connection con = null;
		  PreparedStatement pstmt = null;
		  
		  try{
			  con = DriverManager.getConnection(url, userid, passwd);
			  
			  String sql ="insert into test (num, username,address) "
			  		+ " values ( ? , ? , ? )" ;
			  pstmt = con.prepareStatement(sql);
			  pstmt.setInt(1, num);
			  pstmt.setString(2, name);
			  pstmt.setString(3, address);
	
			  // ********************* TX 시작
			  con.setAutoCommit(false);	// auto커밋 해제
			  
			  int n = pstmt.executeUpdate();
			  
			  int x = 5/0; // 강제 exception 발생
			  
			  if(n == 1) con.commit();
		 
		  }catch(Exception e){
			  e.printStackTrace();
			  try {
				  System.out.println("rollback됨 =============");
				  con.rollback();
			  } catch (SQLException e2) {
				  e2.printStackTrace();
			  }
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

	
}
