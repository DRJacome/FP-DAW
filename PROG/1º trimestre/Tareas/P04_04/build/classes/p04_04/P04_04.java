/*
Programa que guarde las notas de 4 módulos
(los nombres de los módulos puedes ser fijados en el código o pedidos por teclado), de tres alumnos.

Se pedirá el nombre del alumno y la nota obtenida en cada módulo.

Se guardarán las medias por alumno y las medias por módulo. NOTA, las notas son enteras pero las medias serán reales.

Imprimir todas las medias.

Imprimir los nombres de los alumnos que han obtenido la nota más alta (no la media),
indicando también en qué modulo y cual es dicha nota.
 */
package p04_04;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class P04_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Declaramos los parámetros con los que operar: números enteros (int) y nombres (string).
        // Además declaramos un array de 2 dimensiones para hacer lo que necesitamos.
        int alumnos = 3, notasTotales = 4;
        int[][] matriz = new int[alumnos][notasTotales];
        String[] nombreAlumno = new String[alumnos];
        String[] modulo = new String[notasTotales];
        //Aquí declaramos las varaibles para las motas medias de los alumnos y módulos.
        // Estas varaibles se hacen con números reales (decimales), por lo que se usa double.
        double[] mediaAlumno = new double[alumnos];
        double[] mediaModulo = new double[notasTotales];
        int notaMax = matriz[0][0];

        // Ahora recorremos el array simple para introducir los nombres de los alumnos con un for.
        for (int alumno = 0; alumno < alumnos; alumno++) {
            System.out.print("Introduce el nombre del alumno " 
                    + (alumno + 1) 
                    + ": ");
            nombreAlumno[alumno] = tec.nextLine();
        }
        // Ahora recorremos el array simple para introducir los nombres de los módulos.
        for (int asignatura = 0; asignatura < notasTotales; asignatura++) {
            System.out.print("Introduce el módulo " 
                    + (asignatura + 1) 
                    + ": ");
            modulo[asignatura] = tec.nextLine();
        }
        // Ahora recorremos el array bidimensional con dos bucles for (arrays anidados).
        // El primer for es para recorrer las filas del array leyendo cada posición.
        // El segundo for es para rellenar las posiciones leídas del primer for.
        for (int alumno = 0; alumno < alumnos; alumno++) {
            for (int notaModulo = 0; notaModulo < notasTotales; notaModulo++) {
                System.out.println("Introduce la nota del parcial "
                        + (notaModulo + 1) 
                        + " del módulo " 
                        + modulo[notaModulo]
                        + " del alumno " 
                        + nombreAlumno[alumno] + ": ");
                matriz[alumno][notaModulo] = tec.nextInt();
            }
        }
        /*for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < notasTotales; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }*/
        
        // Ahora creamos un array simple para sacar por pantalla las notas medias de los alumnos con dos for anidados.
        for (int alumno = 0; alumno < alumnos; alumno++) {
            for (int notaMedia = 0; notaMedia < notasTotales; notaMedia++) {
                mediaAlumno[alumno] += matriz[alumno][notaMedia];
        }
            System.out.println("El alumno " + nombreAlumno[alumno]
                                + " tiene de nota media "
                                + (mediaAlumno[alumno]/notasTotales));
        }
        // Ahora creamos un array simple para sacar por pantalla las notas medias de los móduos con dos for anidados.
        for (int asignatura = 0; asignatura < notasTotales; asignatura++) {
            for (int alumno = 0; alumno < alumnos; alumno++) {
                mediaModulo[asignatura] += matriz[alumno][asignatura];
            }
            System.out.println("El módulo " + modulo[asignatura]
                                + " tiene de nota media "
                                + (mediaModulo[asignatura]/alumnos));
        }
        // Ahora sacamos por pantalla la nota más alta de la clase (matriz).
        // Necesitamos 2 bucles for anidados para leer qué tiene cada posición.
        for (int alumno = 0; alumno < alumnos; alumno++) {
            for (int asignatura = 0; asignatura < notasTotales; asignatura++) {
                
                if (notaMax < matriz[alumno][asignatura]) {
                    notaMax = matriz[alumno][asignatura];
                }
            }
        }
        
        // Ahora sacamos por pantalla la nota más alta de entre todos los alumnos,
        // indicando en qué módulo la sacó.
        for (int alumno = 0; alumno < alumnos; alumno++) {
            for (int asignatura = 0; asignatura < notasTotales; asignatura++) {
                
                if (notaMax == matriz[alumno][asignatura]) {
                System.out.println("El alumno " + nombreAlumno[alumno]
                                    + " tiene la nota más alta (" + notaMax + ") en "
                                    + modulo[asignatura]);
                }
        }
    }
  }
}