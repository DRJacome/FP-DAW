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
public class Triangulo implements FiguraGeometrica {

    Punto[] puntos;
    int color;
    double gradosGiro;
    boolean visible;
    double base, altura;

    public Triangulo() {
    }

    /**
     * Crea un Triángulo a partir de un punto y la dimensión de base y altura. Se considera colocado horizontalmente:
     * punto 0 -> vértice inferior izquierdo. punto 1-> vértice superior. punto 2 -> vértice inferior derecho. Es un
     * triángulo isósceles.
     *
     * @param punto Vértice inferior izquierdo.
     * @param base Langitud de la base.
     * @param altura longitud de la altura.
     */
    public Triangulo(Punto punto, double base, double altura) {
        puntos = new Punto[3];
        puntos[0] = punto;
        puntos[1] = new Punto(puntos[0].x + base / 2, puntos[0].y + altura);
        puntos[2] = new Punto(puntos[0].x + base, puntos[0].y);

        this.color = 1;
        this.gradosGiro = 0;
        this.visible = true;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        return base + 2 * puntos[0].distanciaPunto(puntos[1]);
    }

    @Override
    public Triangulo pintar(int color) {
        this.color = color;
        return this;
    }

    @Override
    public Triangulo girar(double gradosGiro) {
        this.gradosGiro = gradosGiro;
        return this;
    }

    @Override
    public Triangulo desplazarVertical(double incY) {
        for (int i = 0; i < 3; i++) {
            puntos[i].y += incY;
        }
        return this;
    }

    @Override
    public Triangulo desplazarHorizontal(double incX) {
        for (int i = 0; i < 3; i++) {
            puntos[i].x += incX;
        }
        return this;
    }

    /*public Rectangulo(double base, double altura, Punto punto1, int color, double gradosGiro, boolean visible) {
        super(punto1.x, punto1.y, punto1.x, punto1.y + altura, punto1.x + base, punto1.y + altura, punto1.x + base, punto1.y);
        this.color = color;
        this.gradosGiro = gradosGiro;
        this.visible = visible;
        this.base = base;
        this.altura = altura;
    }*/
    @Override
    public Triangulo redimensionar(double factor) {
        base *= factor;
        altura *= factor;

        puntos[1].x = puntos[0].x + base / 2;
        puntos[1].y = puntos[0].y + altura;
        puntos[2].x = puntos[0].x + base;
        return this;
    }

    @Override
    public String devolverEstado() {
        String puntosString = "";
        for (int i = 0; i < 3; i++) {
            puntosString += "\n Punto " + i + ": " + puntos[i];
        }
        return puntosString + "Color: " + NOMBRE_COLOR[color]
                + " Ángulo de giro: " + this.gradosGiro
                + "\n Visible: " + (visible ? "Sí" : "No")
                + "\n base: " + base
                + "\n altura: " + altura;
    }

    @Override
    public void mostrar() {
        visible = true;
    }

    @Override
    public void ocultar() {
        visible = false;
    }
}
