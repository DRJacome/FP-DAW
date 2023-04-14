/*

 */
package práctica.pkg20.prueba.objetos.pkg2;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Práctica20PruebaObjetos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        Persona persona1 = new Persona();
        persona1.nombre = "Luisa";
        System.out.println("Nombre: " + persona1.nombre);
        persona1.dni = "46373827 H";
        System.out.println("DNI: " + persona1.dni);
        persona1.fechaNacimiento = "05-04-2001";
        System.out.println("Fecha de nacimiento: " + persona1.fechaNacimiento);
        persona1.estatura = 170;
        System.out.println("Estatura: " + persona1.estatura);

        System.out.println("-------------------------------------");

        Persona persona2 = new Persona("76584993 J", "Ignacio", "15-06-1790", 180);
        persona2.direccion = new DireccionPostal();
        persona2.direccion.cp = "574839";
        persona2.direccion.calle = "Sepúlveda";
        persona2.direccion.numero = 14;
        persona2.direccion.poblacion = "Lalín";
        persona2.direccion.provincia = "Pontevedra";
        System.out.println(persona2);

        Persona persona3 = new Persona("48374957 D", "Pedro");
        //System.out.println(persona3.estatura);
    }
}
