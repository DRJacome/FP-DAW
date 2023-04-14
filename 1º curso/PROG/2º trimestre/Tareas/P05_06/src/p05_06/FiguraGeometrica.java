/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p05_06;

/**
 *
 * @author alumno
 */
public interface FiguraGeometrica {

    String[] NOMBRE_COLOR = {"", "negro", "blanco", "amarillo", "azul", "verde", "morado", "rojo", "aguamarina", "indigo", "naranja"};

    FiguraGeometrica pintar(int color);

    FiguraGeometrica girar(double anguloGiro);

    FiguraGeometrica desplazarHorizontal(double incX);

    FiguraGeometrica desplazarVertical(double incY);

    FiguraGeometrica redimensionar(double factor);

    double perimetro();

    double area();

    void mostrar();

    void ocultar();

    String devolverEstado();
}
