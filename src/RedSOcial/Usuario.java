package RedSOcial;

import miprimercrud.DataAlumno;

public class Usuario {
int idUser;
String correo;
String telefono;
String password;
String nombre;
DataUsuario da=new DataUsuario();

public boolean insertarUsuario() {
	if(da.insertarUsuario(this)) {
		return true;
	}else {
		return false;
	}
	
}
public boolean eliminarUsuario() {
	if(da.eliminarUsuario(this.getIdUser())) {
		return true;
	}else {
		return false;
	}
	
}
public boolean ActualizarUsuario() {
	if(da.ActualizarUsuario(this)) {
		return true;
	}else {
		return false;
	}
	
}

public Usuario() {

}

public Usuario(int idUser, String correo, String telefono, String password, String nombre) {
	
	this.idUser = idUser;
	this.correo = correo;
	this.telefono = telefono;
	this.password = password;
	this.nombre = nombre;
}
public int getIdUser() {
	return idUser;
}
public void setIdUser(int idUser) {
	this.idUser = idUser;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
}
