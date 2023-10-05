package Tabla;

public class Pokemon {
String NombrePokemon;
String TipoPokemon;
String Año;
String Genero;
String Clasificación;
public Pokemon() {
	
}
public Pokemon(String NombrePokemon, String TipoPokemon,String Año,String Genero,String Clasificación) {
	this.NombrePokemon=NombrePokemon;
	this.TipoPokemon=TipoPokemon;
	this.Año=Año;
	this.Genero=Genero;
	this.Clasificación=Clasificación;
}
public String getNombrePokemon() {
	return NombrePokemon;
}
public void setNombrePokemon(String nombrePokemon) {
	NombrePokemon = nombrePokemon;
}
public String getTipoPokemon() {
	return TipoPokemon;
}
public void setTipoPokemon(String tipoPokemon) {
	TipoPokemon = tipoPokemon;
}
public String getAño() {
	return Año;
}
public void setAño(String año) {
	Año = año;
}
public String getGenero() {
	return Genero;
}
public void setGenero(String genero) {
	Genero = genero;
}
public String getClasificación() {
	return Clasificación;
}
public void setClasificación(String clasificación) {
	Clasificación = clasificación;
}

}
