/**
 * @author Jose
 *
 */
public class Estudiante {

	String nombre;
	String cod;
	
	Universidad universidad;
	Grado grado;

	
	public Estudiante(String nombre, String cod) {
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

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}
	
	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	
}
