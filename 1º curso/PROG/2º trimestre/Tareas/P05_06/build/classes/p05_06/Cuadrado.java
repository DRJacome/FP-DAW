package p05_06;

/**
 *
 * @author alumno
 */
public class Cuadrado extends Cuadrilatero {

    double lado;

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return lado * 4;
    }

    /**
     * Redimensiona el cuadrado. El punto 0 se considera fijo.
     *
     * @param factor Factor por el que se multiplicará el tamaño del lado.
     * @return el propio Cuadrado.
     */
    @Override
    public Cuadrado redimensionar(double factor) {
        lado *= factor;
        puntos[1].y = puntos[0].y + lado;
        puntos[2].x = puntos[0].x + lado;
        puntos[2].y = puntos[0].y + lado;
        puntos[3].x = puntos[0].x + lado;
        return this;
    }

    /**
     *
     * Diferentes formas de constructor para construir el cuadrado.Son todos los métodos iguales, sólo cambia cómo se
     * construyen los puntos.
     *
     * @param punto1
     * @param punto2
     */
    public Cuadrado(Punto punto1, Punto punto2) {
        super(punto1.x, punto1.y,
                punto2.x, punto2.y,
                punto1.x + punto1.distanciaPunto(punto2), punto1.y + punto1.distanciaPunto(punto2),
                punto2.x + punto1.distanciaPunto(punto2), punto2.y + punto1.distanciaPunto(punto2));
    }

    /**
     * Crea un Cuadrado a partir de un punto y la dimensión del lado. Se considera colocado horizontalmente: punto 0 ->
     * vértice inferior izquierdo. punto 1-> vértice superior izquierdo. punto 2 -> vértice superior derecho. punto 3 ->
     * vértice inferior derecho.
     *
     * @param punto1: Vértice onferior izquierdo.
     * @param lado: longitud del lado.
     */
    public Cuadrado(Punto punto1, double lado) {
        super(punto1.x, punto1.y, punto1.x, punto1.y + lado, punto1.x + lado, punto1.y + lado, punto1.x + lado, punto1.y);
    }

    public Cuadrado(Punto punto1, double lado, int color, double gradosGiro, boolean visible) {
        super(punto1.x, punto1.y, punto1.x, punto1.y + lado, punto1.x + lado, punto1.y + lado, punto1.x + lado, punto1.y);
        this.color = color;
        this.gradosGiro = gradosGiro;
        this.visible = visible;
        this.lado = lado;
    }

    /**
     * **********************************************************
     * @return
     */
    @Override
    public String devolverEstado() {
        return super.devolverEstado() + "\n Lado: " + lado;
    }
}
