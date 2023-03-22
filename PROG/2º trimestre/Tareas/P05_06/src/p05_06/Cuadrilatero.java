package p05_06;

/**
 *
 * @author alumno
 */
public class Cuadrilatero implements FiguraGeometrica {

    Punto[] puntos;
    int color;
    double gradosGiro;
    boolean visible;

    /* Diferentes constructores de cuadrilátero para llamarlo desde el main*/
    public Cuadrilatero(Punto[] puntos, int color, double gradosGiro, boolean visible) {
        this.puntos = puntos;
        this.color = color;
        this.gradosGiro = gradosGiro;
        this.visible = visible;
    }

    public Cuadrilatero(Punto[] puntos) {
        this.puntos = puntos;
        visible = true;
        color = 1;
    }

    public Cuadrilatero() {
    }

    public Cuadrilatero(double x1, double y1,
            double x2, double y2,
            double x3, double y3,
            double x4, double y4) {

        puntos = new Punto[4];
        puntos[0] = new Punto(x1, y1);
        puntos[1] = new Punto(x2, y2);
        puntos[2] = new Punto(x3, y3);
        puntos[3] = new Punto(x4, y4);
        visible = true;
        color = 1;
    }

    /**
     * ***************************************************************************
     * @param color
     * @return
     */
    @Override
    public Cuadrilatero pintar(int color) {
        this.color = color;
        return this;
    }

    @Override
    public Cuadrilatero girar(double gradosGiro) {
        this.gradosGiro = gradosGiro;
        return this;
    }

    @Override
    public Cuadrilatero desplazarHorizontal(double incX) {
        for (int i = 0; i < 4; i++) {
            puntos[i].x += incX;
        }
        return this;
    }

    @Override
    public Cuadrilatero desplazarVertical(double incY) {
        for (int i = 0; i < 4; i++) {
            puntos[i].y += incY;
        }
        return this;
    }

    @Override
    public Cuadrilatero redimensionar(double factor) {
        throw new UnsupportedOperationException("Característica aún no soportada."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimetro() {
        return 0.0;
    }

    @Override
    public double area() {
        return 0.0;
    }

    @Override
    public void mostrar() {
        visible = true;
    }

    @Override
    public void ocultar() {
        visible = false;
    }

    @Override
    public String devolverEstado() {
        String puntosString = "";
        for (int i = 0; i < 4; i++) {
            puntosString += "\n Punto " + i + ": " + puntos[i];
        }
        return puntosString + "\n Color: " + NOMBRE_COLOR[color]
                + "\n Ángulo de giro: " + this.gradosGiro
                + "\n Visible: " + (visible ? "Sí" : "No")
                + "\n Área: " + area()
                + "\n Perímetro: " + perimetro();
    }
}
