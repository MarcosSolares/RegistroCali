package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import logica.Estudiante;

public class Conectar {
	public static Connection con= null;	              ///:3306
	public static final String driver= "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost/curso";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	PreparedStatement ps;
	ResultSet res;
	
	public Conectar( ) {
		if (con==null) {
			try {
				Class.forName(driver);
				con=DriverManager.getConnection(URL, USERNAME, PASSWORD);
				if (con!= null) {
					System.out.println("Conexión Exitosa");
					
				}
				
			}	catch(ClassNotFoundException|SQLException e) {
				System.out.println("error de conection"+ e);
			}
	}
}
	
	
	public Void EstudianteNuevo(Estudiante e) {
		
	Connection con= null;
	try {
		con= DriverManager.getConnection(URL, USERNAME, PASSWORD);
		Statement sentenciaSQL = con.createStatement();
		String SQL ="INSERT INTO estudiante(cedula,nombre,apellido,primerparcial,segundoparcial,oral)values"
				+ "("+ e.getCedula()+",'"+e.getNombre()+"','"+e.getApellido()
				+"',"+e.getNota1()+","+e.getNota2()+","+e.getNota3()+");";
		
		
		sentenciaSQL.executeUpdate(SQL);
		
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return null;
}
		
}		
	