package by.tavo;

public class Alumno {
	String NumControl;
	String Nom;
	String Ap;
	String Am;
	String Grupo;
	String Carrera;
	String Turno;
	public String getNumControl(){
		return NumControl;
	}
	public void setNumControl(String NumControl) {
		this.NumControl=NumControl;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String Nom) {
		this.Nom=Nom;
		
	}
	public String Ap() {
		return Ap;
	}
	public void SetNom(String Ap) {
		this.Ap=Ap;
	}
	public String Am() {
		return Am;
	}
	public void setAm(String Am) {
		this.Am=Am;
	}
	public String getGrupo() {
		return Grupo;
	}
	public void setGrupo(String Grupo) {
		this.Grupo=Grupo;
	}
	public String Carrera() {
		return Carrera;
	}
	public void setCarrera(String Carrera) {
		this.Carrera=Carrera;
	}
	public String getTurno() {
		return Turno;
	}
	public void setTurno(String Turno) {
		this.Turno=Turno;
	}
	public void tuString() {
		System.out.println("Numero de Control: "+NumControl);
		System.out.println("Nombre: "+Nom);
		System.out.println("Apellido Paterno: "+Ap);
		System.out.println("Apellido Materno: "+Am);
		System.out.println("Grupo: "+Grupo);
		System.out.println("Carrera: "+Carrera);
		System.out.println("Turno: "+Turno);
	}
}




