package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 工具类
 * @author 全文超
 * 2017-07-24 23:24:25
 *
 */
public class DBUtil {
	
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "system";
	private static final String password = "system";
	
	public static Connection getConnection() throws Exception{
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;  //此处出错之后，我们应该提醒用户出错。
			//但是该方法只负责创建conn，所以就将该异常抛出到该方法的调用点处。
		}
		return conn;
	}
	
	public static void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection conn = getConnection();
		System.out.println(conn);
	}
}
