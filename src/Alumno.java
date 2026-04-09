package trabajoUnidad6;

// Clase Alumno con sus atributos y metodos
public class Alumno {
	private String nombre;
	private int edad;
	private double notaMedia;

	public Alumno(String nombre, int edad, double notaMedia) {
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}

	public Alumno() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	@Override
	public String toString() {
		return "Nombre Alumno: " + this.nombre + "\nEdad Alumno: " + this.edad + "\nNota Media: " + this.notaMedia;
	}

}
