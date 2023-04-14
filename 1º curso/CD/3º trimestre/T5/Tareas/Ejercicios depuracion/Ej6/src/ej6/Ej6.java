/*

 */
package ej6;

/**
 * @author Jose
 *
 * Usa el modo debug de Eclipse para encontrar entender la función que realiza este código y corregir los errores que
 * presenta.
 *
 */
import java.util.Scanner;

public class Ej6 {

    /**
     * Hay diversos errores de sintaxis, además de sintaxis propia de <br\>
     * JavaScript (tipo de dato var y método console.log) <br\>
     * y varias clases de java que no se usan.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I am ready to play!");

        System.out.println("What's your age?");
        int userinput = input.nextInt();
        if (userinput < 13) {
            System.out.println("You are allowed to play at your own risk");
        } else {
            System.out.println("Play On!");
        }

        System.out.println("You are at an Iggy concert, and you hear this lyric 'Are you ready?, start running.'");
        System.out.println("Suddenly, Iggy stops and says, 'Who wants to race me at running?'");

        System.out.println("Do you want to race Iggy on stage?");
        String userinputS = input.nextLine();
        if (userinputS.equals("yes")) {
            System.out.println("You and Iggy start racing. It's neck and neck! You win by a shoelace!");
        } else {
            System.out.println("Oh no! Iggy shakes his head and sings 'I set a pace, so I can race without pacing.'");
        }

        System.out.println("Rate your game out of 10");
        int note = input.nextInt();
        if (note >= 8) {
            System.out.println("Thank you! You should race again at the next concert!");
        } else if (note < 8) {
            System.out.println("I'll keep practicing coding and racing.");
        }
    }
}
