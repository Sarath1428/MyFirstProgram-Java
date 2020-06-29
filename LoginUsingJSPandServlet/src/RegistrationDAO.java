import java.sql.*;

import org.apache.catalina.connector.Response;
public class RegistrationDAO {
	
	
	String URL ="jdbc:postgresql://localhost:5432/postgres";
	String UN ="postgres";
	String Password= "password";
	public int insert(String uname,String pass)
	{
		try {
			String sql = "INSERT INTO public.\"Username\"(\r\n" + "	\"Username\", \"Password\")\r\n" + "	VALUES (?, ?);";
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(URL,UN,Password);
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, uname);
	        st.setString(2, pass);
			
			int rs= st.executeUpdate();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return 0;
		

}
}