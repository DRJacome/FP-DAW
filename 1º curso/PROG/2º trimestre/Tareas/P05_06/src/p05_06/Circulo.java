/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05_06;

import java.text.DecimalFormat;

/**
 *
 * @author alumno
 */
public class Circulo implements FiguraGeometrica {

    Punto centro;
    int color;
    double gradosGiro;
    double radio;
    boolean visible;

    public Circulo() {

    }

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
        this.color = 1;
        this.gradosGiro = 0.0;
        this.visible = false;
    }

    public Circulo(Punto centro, int color, double gradosGiro, double radio, boolean visible) {
        this.centro = centro;
        this.color = color;
        this.gradosGiro = gradosGiro;
        this.radio = radio;
        this.visible = visible;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    public Circulo pintar(int color) {
        this.color = color;
        return this;
    }

    @Override
    public Circulo girar(double gradosGiro) {
        this.gradosGiro = gradosGiro;
        return this;
    }

    @Override
    public Circulo desplazarVertical(double incY) {
        centro.y += incY;
        return this;
    }

    @Override
    public Circulo desplazarHorizontal(double incX) {
        centro.x += incX;
        return this;
    }

    @Override
    public Circulo redimensionar(double factor) {
        radio *= factor;
        return this;
    }

    @Override
    public String devolverEstado() {
        DecimalFormat formato = new DecimalFormat("#.00");
        return "\n Centro: " + centro
                + "\n color: " + color + " - " + NOMBRE_COLOR[color]
                + "\n Grados giro: " + gradosGiro
                + "\n Visible: " + (visible ? " Sí" : " No ")
                + "\n Radio: " + formato.format(radio) + "\n";
    }

    @Override
    public void mostrar() {
        visible = true;
    }

    @Override
    public void ocultar() {
        visible = true;
    }
}
