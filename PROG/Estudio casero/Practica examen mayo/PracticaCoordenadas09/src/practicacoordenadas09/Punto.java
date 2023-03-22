/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicacoordenadas09;

/**
 *
 * @author jacod
 */
class Punto implements Comparable<Punto>/*, Comparator<Punto>*/ {

    /**
     * Coordenada X: horizontal;<br>
     * Coordenada Y: Vertical.
     */
    private int coordenadaX;
    private int coordendadaY;

    public Punto(int coordenadaX, int coordendadaY) {
        this.coordenadaX = coordenadaX;
        this.coordendadaY = coordendadaY;
    }

    @Override
    public int compareTo(Punto o) {
        if (this.coordenadaX == o.coordenadaX) {
            return o.coordendadaY - this.coordendadaY;
        }
        return this.coordenadaX - o.coordenadaX;
    }

//    @Override
//    public int compare(Punto o1, Punto o2) {
//        if (o1.coordenadaX == o2.coordenadaX) {
//            return o2.coordendadaY - o1.coordendadaY;
//        }
//        return o1.coordenadaX - o2.coordendadaY;
//    }
    @Override
    public String toString() {
        return "Punto {"
                + "\n coordenada X: " + coordenadaX
                + ",\n coordendada Y: " + coordendadaY
                + "\n" + '}';
    }

}
