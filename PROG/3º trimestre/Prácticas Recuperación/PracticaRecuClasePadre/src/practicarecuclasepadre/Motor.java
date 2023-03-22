/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicarecuclasepadre;

/**
 *
 * @author alumno
 */
class Motor {

    private double potencia;
    private double cilindrada;
    private String tipo;
    private boolean encendido;

    public Motor(double potencia, double cilindrada, String tipo, boolean encendido) {
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.encendido = encendido;
    }

    /**
     * @return the potencia
     */
    public double getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the cilindrada
     */
    public double getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the encendido
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * @param encendido the encendido to set
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}
