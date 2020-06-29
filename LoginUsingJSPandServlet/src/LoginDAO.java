import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class LoginDAO {
	
	String sql = "SELECT \"Username\", \"Password\"\r\n" + "FROM public.\"Username\" where \"Username\" =? And \"Password\"=?";
	String URL ="jdbc:postgresql://localhost:5432/postgres";
	String UN ="postgres";
	String Password= "password";
	public boolean check(String uname,String pass)
	{
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(URL,UN,Password);
			PreparedStatement st =con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
}
}
