/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examen03interface;

/**
 * Una interfaz es una clase abstracta; esto significa que no se podrán
 * instanciar7crear objetos de ella.
 * Una interfaz es una clase que puede implementar a otra,
 * lo que significa que la clase que implemente esta interfaz debe 
 * usar obligatoriamente todos los métodos que tenga la interfaz.
 * @author jacod
 */

public interface Interfaz {

    public Coche primero();

    public Coche ultimo();

    public Coche mayor();

    public Coche menor();
    
}
