import java.util.HashSet;

/**
 * @author Jose
 *
 */
public class Grado {

	String nombre;
	String cod;
	
	Facultad facultad;
	HashSet<Profesor> profesores = new HashSet<Profesor>();
	HashSet<Estudiante> estudiantes = new HashSet<Estudiante>();
	
	
	public Grado(String nombre, String cod) {
		this.nombre = nombre;
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCod() {
		return cod;
	}
	
	public void setCod(String cod) {
		this.cod = cod;
	}
	
	public Facultad getFacultad() {
		return facultad;
	}
	
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	
	//Método para anhadir un profesor en un grado
	public void anhadirProfesor(Profesor profesor) {
		profesores.add(profesor);
	}
	
	//Método para matricular un estudiante en un grado
	public void matricularEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}
	
}
