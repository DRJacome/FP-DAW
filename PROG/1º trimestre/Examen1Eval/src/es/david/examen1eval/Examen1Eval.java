/*

 */
package es.david.examen1eval;

import java.util.Scanner;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Examen1Eval {

    static Scanner tec = new Scanner(System.in);

    static void crearGuitarraClasica() {
        Guitarra x = datosGuitarra();
        System.out.println("Fondo caja resonancia: ");
        double fondoCajaResonancia = Double.parseDouble(tec.nextLine());
        System.out.println("Material del aro: ");
        String materialAro = tec.nextLine();
        GuitarraClasica guitarraClasica = new GuitarraClasica(fondoCajaResonancia, materialAro, x.getAfinación(), x.getCuerdas());
        System.out.println(guitarraClasica);
    }

    static void crearGuitarraElectrica() {
        Guitarra x = datosGuitarra();
        System.out.println("Ajuste Alma (s\n): ");
        boolean ajusteAlma = tec.nextLine().toUpperCase().equals("S");
        System.out.println("Número de pastillas: ");
        int numeroPastillas = Integer.parseInt(tec.nextLine());
        GuitarraElectrica guitarraElectrica = new GuitarraElectrica(ajusteAlma, numeroPastillas, x.getAfinación(), x.getCuerdas());
        System.out.println(guitarraElectrica);
    }

    static Guitarra datosGuitarra() {
        System.out.println("Afinación: ");
        String afinacion = tec.nextLine();
        System.out.println("Número de cuerdas: ");
        int numeroCuerdas = Integer.parseInt(tec.nextLine());
        Cuerda[] cuerdas = new Cuerda[numeroCuerdas];
        for (int i = 0; i < numeroCuerdas; i++) {
            System.out.println("Cuerda " + (i + 1));
            System.out.println("diámetro: ");
            double diametro = Double.parseDouble(tec.nextLine());

            System.out.println("material: ");
            String material = tec.nextLine();
            cuerdas[i] = new Cuerda(diametro, material);
        }
        return new Guitarra(afinacion, cuerdas);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("1- Crear guitarra eléctrica"
                    + "\n2- Crear guitarra clásica"
                    + "\n3- Abortar");

            int opcion;
            do {
                opcion = Integer.parseInt(tec.nextLine());
            } while (opcion < 1 || opcion > 3);

            switch (opcion) {
                case 1:
                    crearGuitarraElectrica();
                    System.exit(0);
                case 2:
                    crearGuitarraClasica();
                    System.exit(0);
                case 3:
                    System.exit(0);
            }
        }
    }
}
