import java.util.HashSet;

/**
 * @author Jose
 *
 */
public class Universidad {

	String nombre;
	
	HashSet<Estudiante> estudiantes = new HashSet<Estudiante>();
	HashSet<Facultad> facultades = new HashSet<Facultad>();
	
	public Universidad() {
	}
	
	public Universidad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Método para matricular un estudiante en la universidad
	public void matricularEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}
	
	//Método para anhadir una facultad a la universidad
	public void anhadirFacultad(Facultad facultad) {
		facultades.add(facultad);
	}

}
