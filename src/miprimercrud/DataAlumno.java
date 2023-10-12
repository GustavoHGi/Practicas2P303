package miprimercrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataAlumno {
	Connection cx;

	public static void main(String[] args) {
		DataAlumno da = new DataAlumno();
		da.conectar();
	}
	
	public DataAlumno() {
		
	}
	
public Connection conectar() {
	try {
		cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/alumno","root","");
		System.out.println("CONEXION EXITOSA");
	} catch (SQLException e) {
		System.out.println("FALLO CONEXION");
		e.printStackTrace();
	}
	return cx;
	
    }
public boolean insertarAlumno(Alumno a) {
	PreparedStatement ps;
	try {
	ps=conectar().prepareStatement("Insert Into Alumno Values(null,?,?,?,?,?,?,?,?,?,?,?)");
	ps.setString(1,a.getNumcontrol());
	ps.setString(2,a.getNombre());
	ps.setString(3,a.getApellidom());
	ps.setString(4,a.getApellidop());
	ps.setString(5,a.getCurp());
	ps.setString(6,a.getFecha());
	ps.setString(7,a.getDireccion());
	ps.setString(8,a.getTelefono());
	ps.setString(9,a.getCorreo());
	ps.setString(10,a.getGrupo());
	ps.setString(11,a.getCarrea());
	ps.execute();
}catch (SQLException e) {
	e.printStackTrace();
}
	return false;
}
}
