import java.util.HashSet;

/**
 * @author Jose
 *
 */
public class Facultad {

	String nombre;
	
	Universidad universidad;
	HashSet<Grado> grados = new HashSet<Grado>();

	
	public Facultad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	//Método para anhadir un grado en la facultad
	public void anhadirGrado(Grado grado) {
		grados.add(grado);
	}

}
