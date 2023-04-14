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
public class Hijo extends Padre {

    protected boolean hA;
    protected String hB;

    public Hijo(boolean hA, String hB, int pA, String pB, double pC) {
        super(pA, pB, pC);
        this.hA = hA;
        this.hB = hB;
    }

    public Hijo(boolean hA, String hB) {
        super(10, "pB", 2.50);
        this.hA = hA;
        this.hB = hB;
    }

    public Hijo(boolean hA, String hB, String pB) {
        super(pB);
        this.hA = hA;
        this.hB = hB;
    }

    /**
     * @return the hA
     */
    public boolean ishA() {
        return hA;
    }

    /**
     * @param hA the hA to set
     */
    public void sethA(boolean hA) {
        this.hA = hA;
    }

    /**
     * @return the hB
     */
    public String gethB() {
        return hB;
    }

    /**
     * @param hB the hB to set
     */
    public void sethB(String hB) {
        this.hB = hB;
    }

    @Override
    public String toString() {
        return super.toString() + "Hijo{" + "hA=" + hA + ", hB=" + hB + '}';
    }

}
