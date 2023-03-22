package p05_06;

/**
 *
 * @author alumno
 */
public class Rectangulo extends Cuadrilatero {

    double base;
    double altura;

    /**
     * Crea un Rectángulo a partir de un punto y la dimensión de ambos lados. Se considera colocado horizontalmente:
     * punto 0 -> vértice inferior izquierdo. punto 1-> vértice superior izquierdo. punto 2 -> vértice superior derecho.
     * punto 3 -> vértice inferior derecho.
     *
     * @param punto
     * @param base
     * @param altura
     */
    public Rectangulo(Punto punto, double base, double altura) {
        super(punto.x, punto.y, punto.x, punto.y + altura, punto.x + base, punto.y + altura, punto.x + base, punto.y);
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    public Rectangulo(double base, double altura, Punto punto1, int color, double gradosGiro, boolean visible) {
        super(punto1.x, punto1.y, punto1.x, punto1.y + altura, punto1.x + base, punto1.y + altura, punto1.x + base, punto1.y);
        this.color = color;
        this.gradosGiro = gradosGiro;
        this.visible = visible;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Rectangulo redimensionar(double factor) {
        base *= factor;
        altura *= factor;

        puntos[1].y = puntos[0].y + altura;
        puntos[2].x = puntos[0].x + base;
        puntos[2].y = puntos[0].y + altura;
        puntos[3].x = puntos[0].x + base;

        return this;
    }

    @Override
    public String devolverEstado() {
        return super.devolverEstado() + "\n Base: " + base + ", \n Altura: " + altura;
    }
}
