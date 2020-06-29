package HelloWorld;
import java.sql.*;

public class JDBC_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String URL ="jdbc:postgresql://localhost:5432/postgres";
		String UN ="postgres";
		String Password= "password";
		Class.forName("org.postgresql.Driver");
		Connection Con = DriverManager.getConnection(URL,UN,Password);
		Statement st = Con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM public.\"Student\"");
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		st.close();
		Con.close();

	}

}
