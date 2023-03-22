/*

 */
package práctica.pkg18.clases;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica18_Clases_y_orientación_objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //Referencia a objeto.
        Persona unaPersona = new Persona();

        unaPersona.nombre = tec.nextLine();
        unaPersona.estatura = 186;
        unaPersona.trabaja = true;
        unaPersona.puestoTrabajo = "SEUR";

        /*System.out.println("Estado inicial\n"
                + "Nombre - " + unaPersona.nombre + " "
                + "Apellido - " + unaPersona.apellidos + " "
                + "Edad - " + unaPersona.estatura + ""
                + "Trabaja - " + unaPersona.trabaja + " "
                + "Puesto Trabajo - " + unaPersona.puestoTrabajo);*/
        //
        //Cambiar campos escritos en el sout anterior por -> unaPersona.
        System.out.println("Estado inicial\n"
                + unaPersona);

        System.out.println("Estatura en pulgadas = "
                + unaPersona.estaturaEnPulgadas());
        unaPersona.despedir();

        System.out.println("Estado final\n"
                + "Nombre - " + unaPersona.nombre + " "
                + "Apellido - " + unaPersona.apellidos + " "
                + "Edad - " + unaPersona.estatura + ""
                + "Trabaja - " + unaPersona.trabaja + " "
                + "Puesto Trabajo - " + unaPersona.puestoTrabajo);

        Persona otro = unaPersona;
        unaPersona = null;

        System.out.println("Estado OTRO final\n"
                + "Nombre - " + unaPersona.nombre + " "
                + "Apellido - " + unaPersona.apellidos + " "
                + "Edad - " + unaPersona.estatura + ""
                + "Trabaja - " + unaPersona.trabaja + " "
                + "Puesto Trabajo - " + unaPersona.puestoTrabajo);

        System.out.println("Estado final\n"
                + "Nombre - " + unaPersona.nombre + " "
                + "Apellido - " + unaPersona.apellidos + " "
                + "Edad - " + unaPersona.estatura + ""
                + "Trabaja - " + unaPersona.trabaja + " "
                + "Puesto Trabajo - " + unaPersona.puestoTrabajo);
    }
}
