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
public class Padre {

    protected int pA;
    protected String pB;
    protected double pC;
    public static final double PI = 3.141516;

    public Padre() {
        System.out.println("Llama a padre vacío.");
    }

    public Padre(String pB) {
        this.pB = pB;
    }

    public Padre(int pA, String pB, double pC) {
        System.out.println("Llama a padre con 3 valores.");
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
    }

    /**
     * @return the pA
     */
    public int getpA() {
        return pA;
    }

    /**
     * @param pA the pA to set
     */
    public void setpA(int pA) {
        this.pA = pA;
    }

    /**
     * @return the pB
     */
    public String getpB() {
        System.out.println("Llama a padre con 1 valor.");
        return pB;
    }

    /**
     * @param pB the pB to set
     */
    public void setpB(String pB) {
        this.pB = pB;
    }

    /**
     * @return the pC
     */
    public double getpC() {
        return pC;
    }

    /**
     * @param pC the pC to set
     */
    public void setpC(double pC) {
        this.pC = pC;
    }

    @Override
    public String toString() {
        return "Padre{" + "pA=" + pA + ", pB=" + pB + ", pC=" + pC + '}';
    }
}
