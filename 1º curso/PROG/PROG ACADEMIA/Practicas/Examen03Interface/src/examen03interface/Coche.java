/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen03interface;

/**
 *
 * @author jacod
 */
public class Coche {

    // Atributos de la clase.
    private String matricula;
    private String marca;
    private String modelo;
    private int bastidor;

    // Constructor de la clase.
    public Coche(String matricula, String marca, String modelo, int bastidor) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
    }

    // Constructor por defecto.
    public Coche() {
        this.matricula = "";
    }

    // Getters y setters.
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the bastidor
     */
    public int getBastidor() {
        return bastidor;
    }

    /**
     * @param bastidor the bastidor to set
     */
    public void setBastidor(int bastidor) {
        this.bastidor = bastidor;
    }

    @Override
    public String toString() {
        return "\n Coche {"
                + "\n - Matrícula->" + matricula
                + ",\n - Marca->" + marca
                + ",\n - Modelo->" + modelo
                + ",\n - Bastidor->" + bastidor
                + "\n " + '}';
    }

}
