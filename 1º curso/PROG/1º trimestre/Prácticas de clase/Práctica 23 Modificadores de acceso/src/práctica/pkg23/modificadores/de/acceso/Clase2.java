/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.pkg23.modificadores.de.acceso;

/**
 *
 * @author alumno
 */
public class Clase2 {

    //En principio las clases deben ser públicas,
    //a menos que sean para cálculos internos.
    private class InnerClass {

        String x;

        //Los constructores siempre has de ser públicos.
        public InnerClass() {

        }
    }

    //Por lo general, las varaibles de las clases privadas deben ser privadas
    //y ser llamdas mediantes setters o getters.
    //En el caso de los booleanos, en vez de "get" es "is" (get-> is).
    //"final" significa que su valor es constante, nunca cambia.
    final double PI;
    private int a;
    private int b;
    private int c;
    protected int d;
    private boolean primo;

    // con "final" sólo se puede inicializar una vez.
    // Si queremos inicializarlo otra vez, no nos dejará.
    public Clase2(double PI) {
        this.PI = PI;
    }

    // Error de "final".
    /*PI = 25.3;*/
    final public void m1() {
        /*InnerClass z = new InnerClass();
        z.x = "hola";*/

        System.out.println("ZYX");
    }

    private void m2() {
    }

    protected void m3() {
        m2();
    }

    void m4() {

    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @param d the d to set
     */
    public void setD(int d) {
        this.d = d;
    }

    /**
     * @return the primo
     */
    public boolean isPrimo() {
        return primo;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

}
