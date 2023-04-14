/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.examen.pkg2.eva;

import java.io.Serializable;

/**
 *
 * @author jacod
 */
public class Rueda implements Serializable {

    private String marca;
    private int tamanho;

    public Rueda() {
    }

    public Rueda(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca
                + ", tamanho=" + tamanho + '}';
    }

}
