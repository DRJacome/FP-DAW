/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package args_comandosporconsola;

/**
 *
 * @author alumno
 */
public class Args_ComandosPorConsola {

    /**
     * @param args the command line arguments
     */
    /**
     * Hay dos formas de introducir argumentos: <br>
     * -> Por propiedades de proyecto en NetBeans: Seleccionar proyecto > properties > Run > Arguments.<br>
     * Se deben introducir los argumentos como strings.
     *
     * -> Mediante consolsa de comandos: En la terminal vamos a la ruta del .jar (cd),<br>
     * ejecutamos el .jar con "java -jar nombreJar.jar" <br>
     * y se introducen los argumentos separados con espacios.
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Args " + i + ": " + args[i]);
        }
    }
}
