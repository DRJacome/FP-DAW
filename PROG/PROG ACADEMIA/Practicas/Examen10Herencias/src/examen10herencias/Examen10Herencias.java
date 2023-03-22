/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen10herencias;

/**
 *
 * @author alumno
 */
public class Examen10Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseC objeto1 = new ClaseC(5, 3, 1);
        ClaseC objeto2 = new ClaseC(9, 8, 6);

        int contadorB = ClaseC.contadorB;
        System.out.println("Contador de la Clase B: " + contadorB);

        System.out.println("////////////////");
        int contadorC = ClaseC.contadorC;
        System.out.println("Contador de la clase C: " + contadorC);

        System.out.println("Atributo A de la clase A, objeto 1: " + objeto1.atrA);

        System.out.println("Atributo B de la clase B, objeto 1: " + objeto1.atrB);

        System.out.println("Atributo C de la clase C, objeto 2: " + objeto2.getAtrC());
    }

}
