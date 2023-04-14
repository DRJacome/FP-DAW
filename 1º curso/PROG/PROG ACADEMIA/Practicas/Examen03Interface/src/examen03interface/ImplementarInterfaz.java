
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen03interface;

import java.util.LinkedList;

/**
 *
 * @author jacod
 */
public class ImplementarInterfaz implements Interfaz {

    // Atributo de la clase Coche.
    private LinkedList<Coche> coches;

    // Constructor de la clase ImplementarInterfaz que debe tener
    // una lista enlazada de la clase Coche.
    public ImplementarInterfaz(LinkedList<Coche> coches) {
        this.coches = coches;
    }

    // Constructor de la clase por defecto.
    // Es preferible que el constructor por defecto
    // tenga algún tipo de dato, aunque sea un dato vacío.
    public ImplementarInterfaz() {
        this.coches = new LinkedList<>();
    }

    @Override
    public Coche primero() {
        return this.coches.getFirst();
    }

    @Override
    public Coche ultimo() {
        return this.coches.getLast();
    }

    @Override
    public Coche mayor() {
        Coche mayor = this.coches.get(0);
        for (int i = 1; i < this.coches.size() - 1; i++) {
            if (this.coches.get(i).getBastidor() > mayor.getBastidor()) {
                mayor = this.coches.get(i);
            }
        }
        return mayor;
    }

    @Override
    public Coche menor() {
        Coche menor = this.coches.get(0);
        for (int i = 1; i < this.coches.size() - 1; i++) {
            if (this.coches.get(i).getBastidor() < menor.getBastidor()) {
                menor = this.coches.get(i);
            }
        }
        return menor;
    }
}
