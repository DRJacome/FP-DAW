/*

 */
package p05_05;

/**
 *
 * @author David Rodríguez Jácome
 */
public class BicicletaCarretera extends Bicicleta {

    private double dropManillar;

    public BicicletaCarretera(double dropManillar, int[] presion, int color, int kmsCadena) {
        super(presion, color, kmsCadena);
        this.dropManillar = dropManillar;
        tipo = "Carretera";
    }

    public BicicletaCarretera(double dropManillar) {
        this.dropManillar = dropManillar;
    }

    public BicicletaCarretera() {
    }

    @Override
    public String comprobarEstadoCadena() {
        if (kmsCadena <= 5000) {
            return "La cadena está en buen estado.";
        } else if (kmsCadena <= 7000) {
            return "La cadena está demasiado gastada.";
        } else {
            return "Sustituir inmediatamente la cadena.";
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nEl drop del manillar es: " + getDropManillar() + "\n";
    }

    /**
     * @return the dropManillar
     */
    public double getDropManillar() {
        return dropManillar;
    }

    /**
     * @param dropManillar the dropManillar to set
     */
    public void setDropManillar(double dropManillar) {
        this.dropManillar = dropManillar;
    }
}
