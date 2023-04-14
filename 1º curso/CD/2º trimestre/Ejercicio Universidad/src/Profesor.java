/**
 * @author Jose
 *
 */
public class Profesor {

	String nombre;
	String cod;
	
	Grado grado;
	
	
	public Profesor(String nombre, String cod) {
		super();
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
	
	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	
}
