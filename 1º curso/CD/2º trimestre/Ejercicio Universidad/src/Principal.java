import java.util.HashSet;

import javax.swing.JOptionPane;

/**
 * @author Jose
 *
 */
public class Principal {
	
	static HashSet<Universidad> universidades = new HashSet<Universidad>();
	
	public static void main(String[] args) {
		
		boolean salir = false;
		int opcion;
		String datosMenu;
		
		while (salir != true) {
			
			datosMenu = "-- SISTEMA DE GESTIÓN UNIVERSITARIO --\n" +
						"\n"+
						"1. Dar de alta una universidad\n"+
						"2. Matricular un estudiante en una universidad\n" +
						"3. Añadir facultad a una universidad\n" +	
						"4. Añadir un grado a una facultad\n" +
						"5. Matricular un alumno en un grado\n" +
						"6. Asignar un profesor a un grado\n" +
						"7. Listar el alumnado que estudia en una universidad\n" +
						"8. Listar las facultades que forman una universidad\n" +		
						"9. Listar los grados impartidos en una facultad\n" +
						"10. Listar el alumnado matriculado en un grado\n" +
						"11. Listar los profesores que imparten clases en un grado\n" +
						"12. Listar las universidades dadas de alta en el sistema\n" +
						"13. Salir\n" +
						"\nIngrese opción:\n";

			opcion = Integer.valueOf(JOptionPane.showInputDialog(datosMenu));
			
			switch (opcion) {
			case 1:
				Universidad universidad;
				String nombreUniversidad;
				
				nombreUniversidad = JOptionPane.showInputDialog("Introduzca el nombre de la univerdad:\n");
				universidad = new Universidad(nombreUniversidad);
				universidades.add(universidad);
				
				break;
				
			case 2:
				Estudiante estudiante;
				String nombreEstudiante;
				String codEstudiante;
				
				nombreUniversidad = JOptionPane.showInputDialog("Introduzca el nombre de la univerdad:\n");	
				nombreEstudiante = JOptionPane.showInputDialog("Introduzca el nombre del estudiante:\n");
				codEstudiante = JOptionPane.showInputDialog("Introduzca el codigo del estudiante:\n");
				estudiante = new Estudiante(nombreEstudiante, codEstudiante);
				
				matricularEstudianteUniversidad(estudiante, nombreUniversidad);
				
				break;
				
			case 3:
				Facultad facultad;
				String nombreFacultad;
				
				nombreUniversidad = JOptionPane.showInputDialog("Introduzca el nombre de la univerdad:\n");
				nombreFacultad = JOptionPane.showInputDialog("Introduzca el nombre de la facultad:\n");
				facultad = new Facultad(nombreFacultad);
				
				anhadirFacultad(facultad, nombreUniversidad);
				
				break;
				
			case 4:
				Grado grado;
				String nombreGrado;
				String codGrado;
				
				nombreFacultad = JOptionPane.showInputDialog("Introduzca el nombre de la facultad:\n");
				nombreGrado = JOptionPane.showInputDialog("Introduzca el nombre del grado:\n");
				codGrado = JOptionPane.showInputDialog("Introduzca el codigo del grado:\n");
				grado = new Grado(nombreGrado, codGrado);
				
				anhadirGrado(grado, nombreFacultad);
				
				break;
				
			case 5:			
				nombreEstudiante = JOptionPane.showInputDialog("Introduzca el nombre del estudiante:\n");
				codEstudiante = JOptionPane.showInputDialog("Introduzca el codigo del estudiante:\n");
				nombreGrado = JOptionPane.showInputDialog("Introduzca el nombre del grado:\n");
				estudiante = new Estudiante(nombreEstudiante, codEstudiante);
				
				matricularEstudianteGrado(estudiante, nombreGrado);
				
				break;
				
			case 6:
				Profesor profesor;
				String nombreProfesor;
				String codProfesor;
				
				nombreProfesor = JOptionPane.showInputDialog("Introduzca el nombre del profesor:\n");
				codProfesor = JOptionPane.showInputDialog("Introduzca el código de profesor:\n");
				nombreGrado = JOptionPane.showInputDialog("Introduzca el nombre del grado:\n");
				profesor = new Profesor(nombreProfesor, codProfesor);
				
				anhadirProfesorGrado(profesor, nombreGrado);
				break;
				
			case 7:
				nombreUniversidad = JOptionPane.showInputDialog("Introduzca el nombre de la univerdad:\n");
				listarEstudiantesUniversidad(nombreUniversidad);
				
				break;
				
			case 8:
				nombreUniversidad = JOptionPane.showInputDialog("Introduzca el nombre de la univerdad:\n");
				listarFacultades(nombreUniversidad);
				break;
				
			case 9:
				nombreFacultad = JOptionPane.showInputDialog("Introduzca el nombre de la facultad:\n");
				listarGradosFacultad(nombreFacultad);
				break;
				
			case 10:
				nombreGrado = JOptionPane.showInputDialog("Introduzca el nombre del grado:\n");
				listarEstudiantesGrado(nombreGrado);
				break;
				
			case 11:
				nombreGrado = JOptionPane.showInputDialog("Introduzca el nombre del grado:\n");
				listarProfesoresGrado(nombreGrado);
				break;
				
			case 12:
				listarUniversidades();
				break;
				
			case 13:
				salir = true;
				break;
				
			default:
				break;
			}
		}
	}

	/** 
	 * 2. Matricular un estudiante en una universidad
	 */
	private static void matricularEstudianteUniversidad(Estudiante estudiante, String universidad) {
		
		for (Universidad u : universidades) {
			
			if(u.getNombre().equals(universidad)){
				u.matricularEstudiante(estudiante);
			}
		}
	}

	/**
	 * 3. Añadir facultad a una universidad
	 */
	private static void anhadirFacultad(Facultad facultad, String universidad) {
		
		for (Universidad u : universidades) {
			
			if(u.getNombre().equals(universidad)){
				u.anhadirFacultad(facultad);
			}
		}
	}
	
	/**
	 * 4. Añadir un grado a una facultad
	 */
	private static void anhadirGrado(Grado grado, String facultad) {
		
		for (Universidad u : universidades) {
			for (Facultad f: u.facultades)
			if(f.getNombre().equals(facultad)){
				f.anhadirGrado(grado);
			}
		}
	}
	
	/**
	 * 5. Matricular un alumno en un grado
	 */
	private static void matricularEstudianteGrado(Estudiante estudiante, String grado){
		
		for (Universidad u : universidades) {
			for (Facultad f: u.facultades) {
				for (Grado g : f.grados) {
					if(g.getNombre().equals(grado)) {
						g.matricularEstudiante(estudiante);
					}
				}
			}
		}
	}
	
	/**
	 * 6. Asignar un profesor a un grado
	 */
	private static void anhadirProfesorGrado(Profesor profesor, String grado) {
		
		for (Universidad u : universidades) {
			for (Facultad f: u.facultades) {
				for (Grado g : f.grados) {
					if (g.getNombre().equals(grado)) {
						g.anhadirProfesor(profesor);
					}
				}
			}
		}
	}
	
	/**
	 * 7. Listar el alumnado que estudia en una universidad
	 */
	private static void listarEstudiantesUniversidad(String universidad) {
		
		String datosMenu = "-- LISTADO DE ESTUDIANTES DE LA " + universidad + " --\n" + "\n";
		
		for (Universidad u : universidades) {
			if(u.getNombre().equals(universidad)){
				for (Estudiante e : u.estudiantes) {
					datosMenu = datosMenu.concat(e.getNombre().concat("\n"));
				}
			}
		}
		JOptionPane.showMessageDialog(null, datosMenu);	
	}
	
	/**
	 * 8. Listar las facultades que forman una universidad
	 */
	private static void listarFacultades(String universidad) {
		
		String datosMenu = "-- LISTADO DE FACULTADES DE LA " + universidad + " --\n" + "\n";
		
		for (Universidad u : universidades) {
			if(u.getNombre().equals(universidad)){
				for (Facultad f : u.facultades) {
					datosMenu = datosMenu.concat(f.getNombre().concat("\n"));
				}
			}
		}
		JOptionPane.showMessageDialog(null, datosMenu);
	}

	/**
	 * 9. Listar los grados impartidos en una facultad 
	 */
	private static void listarGradosFacultad(String facultad) {
		
		String datosMenu = "-- LISTADO DE GRADOS IMPARTIDOS EN LA FACULTAD " + facultad + " --\n" + "\n";
		
		for (Universidad u : universidades) {
			for (Facultad f: u.facultades) {
				if(f.getNombre().equals(facultad)){
					for (Grado g : f.grados) {
						datosMenu = datosMenu.concat(g.getNombre().concat("\n"));
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, datosMenu);
	}
	
	/**
	 * 10. Listar el alumnado matriculado en un grado
	 */
	private static void listarEstudiantesGrado(String grado) {
		
		String datosMenu = "-- LISTADO DE ESTUDIANTES MATRICULADOS EN EL GRADO " + grado + " --\n" + "\n";
		
		for (Universidad u : universidades) {
			for (Facultad f: u.facultades) {
				for (Grado g: f.grados) {
					if(g.getNombre().equals(grado)){
						for (Estudiante e: g.estudiantes) {
							datosMenu = datosMenu.concat(e.getNombre().concat("\n"));
						}
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, datosMenu);
	}
	
	/**
	 * 11. Listar los profesores que imparten clases en un grado
	 */
	private static void listarProfesoresGrado(String grado) {
		
		String datosMenu = "-- LISTADO DE PROFESORES QUE IMPARTEN CLASES EN EL GRADO " + grado + " --\n" + "\n";
		
		for (Universidad u : universidades) {
			for (Facultad f: u.facultades) {
				for (Grado g: f.grados) {
					if(g.getNombre().equals(grado)){
						for (Profesor p: g.profesores) {
							datosMenu = datosMenu.concat(p.getNombre().concat("\n"));
						}
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, datosMenu);
	}
	
	
	/**
	 * 12. Listar las universidades dadas de alta en el sistema
	 */
	private static void listarUniversidades() {
		
		String datosMenu = "-- LISTADO DE UNIVERSIDADES --\n" + "\n";
		
		for (Universidad u : universidades) {
			datosMenu = datosMenu.concat(u.getNombre().concat("\n"));
		}
		JOptionPane.showMessageDialog(null, datosMenu);	
	}

}
