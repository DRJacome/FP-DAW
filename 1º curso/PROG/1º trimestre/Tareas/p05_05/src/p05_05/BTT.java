/*
 */
package p05_05;

/**
 *
 * @author David Rodríguez Jácome
 */
public class BTT extends Bicicleta {

    private int recorridoSuspensionDelantera;
    private int recorridoSupensionTrasera;

    public BTT(int recorridoSuspensionDelantera, int recorridoSupensionTrasera, int[] presion, int color, int kmsCadena) {
        super(presion, color, kmsCadena);
        this.recorridoSuspensionDelantera = recorridoSuspensionDelantera;
        this.recorridoSupensionTrasera = recorridoSupensionTrasera;
        tipo = "BTT";
    }

    public BTT(int recorridoSuspensionDelantera, int recorridoSupensionTrasera) {
        this.recorridoSuspensionDelantera = recorridoSuspensionDelantera;
        this.recorridoSupensionTrasera = recorridoSupensionTrasera;
    }

    public BTT() {
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nRecorrido de la suspensión delantera: "
                + getRecorridoSuspensionDelantera()
                + "\nRecorrido de la supensión trasera: "
                + getRecorridoSupensionTrasera() + "\n";
    }

    /**
     * @return the recorridoSuspensionDelantera
     */
    public int getRecorridoSuspensionDelantera() {
        return recorridoSuspensionDelantera;
    }

    /**
     * @param recorridoSuspensionDelantera the recorridoSuspensionDelantera to set
     */
    public void setRecorridoSuspensionDelantera(int recorridoSuspensionDelantera) {
        this.recorridoSuspensionDelantera = recorridoSuspensionDelantera;
    }

    /**
     * @return the recorridoSupensionTrasera
     */
    public int getRecorridoSupensionTrasera() {
        return recorridoSupensionTrasera;
    }

    /**
     * @param recorridoSupensionTrasera the recorridoSupensionTrasera to set
     */
    public void setRecorridoSupensionTrasera(int recorridoSupensionTrasera) {
        this.recorridoSupensionTrasera = recorridoSupensionTrasera;
    }
}
