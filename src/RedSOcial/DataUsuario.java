package RedSOcial;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import miprimercrud.Alumno;
import miprimercrud.DataAlumno;
public class DataUsuario {
	Connection cx;
	public static void main(String[] args) {
		DataAlumno da = new DataAlumno();
		da.conectar();
	}
	
	public DataUsuario() {
		
	}
	
public Connection conectar() {
	try {
		cx=DriverManager.getConnection("jdbc:mysql://localhost:3306/redsocial","root","");
		System.out.println("CONEXION EXITOSA");
	} catch (SQLException e) {
		System.out.println("FALLO CONEXION");
		e.printStackTrace();
	}
	return cx;
	
    }
public boolean insertarUsuario(Usuario a) {
	PreparedStatement ps;
	try {
	ps=conectar().prepareStatement("Insert Into usuario Values(null,?,?,?,?)");
	ps.setString(1,a.getCorreo());
	ps.setString(2,a.getTelefono());
	ps.setString(3,a.getPassword());
	ps.setString(4,a.getNombre());
	
	ps.execute();
	return true;
}catch (SQLException e) {
	e.printStackTrace();
	return false;
}
	
}


public ArrayList<Usuario> selctUsuario(){
	ArrayList<Usuario> listaUsuario=new ArrayList<Usuario>();
	try {
		PreparedStatement ps=conectar().prepareStatement("SELECT * From usuario");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			Usuario x=new Usuario();
			x.setIdUser(rs.getInt(1));
			x.setCorreo(rs.getString(2));
			x.setTelefono(rs.getString(3));
			x.setPassword(rs.getString(4));
			x.setNombre(rs.getString(5));
			
			listaUsuario.add(x);
		}
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
	return listaUsuario;
}
public boolean eliminarUsuario(int id) {
	PreparedStatement ps;
	try {
	ps=conectar().prepareStatement("DELETE FROM usuario WHERE idUser=?");
	ps.setInt(1,id);
	ps.execute();
	return true;
}catch (SQLException e) {
	e.printStackTrace();
	return false;
}
	
}
public boolean ActualizarUsuario(Usuario a) {
	PreparedStatement ps;
	try {
	ps=conectar().prepareStatement("UPDATE usuario SET correo=?,telefono=?,password=?,nombre=? WHERE idUser=?");
	ps.setString(1,a.getCorreo());
	ps.setString(2,a.getTelefono());
	ps.setString(3,a.getPassword());
	ps.setString(4,a.getNombre());
	ps.setInt(5,a.getIdUser());
	
	ps.execute();
	return true;
}catch (SQLException e) {
	e.printStackTrace();
	return false;
}
	
}
}


