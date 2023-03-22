/*

 */
package p05_05;

/**
 *
 * @author David Rodríguez Jácome
 */
public class Bicicleta {

    protected int[] presion;
    /* 0-> delantera, 1 -> trasera */
    protected int color;
    protected String tipo;
    protected int kmsCadena;

    public Bicicleta(int[] presion, int color, String tipo, int kmsCadena) {
        this.presion = presion;
        this.color = color;
        this.tipo = tipo;
        this.kmsCadena = kmsCadena;
    }

    public Bicicleta(int[] presion, int color, int kmsCadena) {
        this.presion = presion;
        this.color = color;
        this.kmsCadena = kmsCadena;
    }

    public Bicicleta() {
    }

    /**
     * @return the presion
     */
    public int[] getPresion() {
        return presion;
    }

    /**
     * Devuelve la presión de una rueda.
     *
     * @param rueda 0-> delantera, 1 -> trasera
     * @return La presión de la rueda seleccionada.
     */
    public int getPresion(int rueda) {
        return presion[rueda];
    }

    /**
     * @param presion the presion to set
     */
    public void setPresion(int[] presion) {
        this.presion = presion;
    }

    /**
     * Da presión a una rueda.
     *
     * @param presion presión a aplicar.
     * @param rueda
     * @parametro rueda 0 -> delantera, 1 -> trasera.
     */
    public void setPresion(int presion, int rueda) {
        this.presion[rueda] = presion;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param Tipo the tipo to set
     */
    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    /**
     * @return the kmsCadena
     */
    public int getKmsCadena() {
        return kmsCadena;
    }

    /**
     * @param kmsCadena the kmsCadena to set
     */
    public void setKmsCadena(int kmsCadena) {
        this.kmsCadena = kmsCadena;
    }

    public String comprobarEstadoCadena() {
        if (kmsCadena <= 1800) {
            return "La cadena está en buen estado.";
        } else if (kmsCadena <= 2000) {
            return "La cadena está demasiado gastada.";
        } else {
            return "Sustituir inmediatamente la cadena.\n";
        }
    }

    @Override
    public String toString() {
        return "Prestaciones bicicleta {"
                + "\n presion = " + presion[0] + ", " + presion[1]
                + "\n color = " + color
                + "\n Tipo = " + tipo
                + "\n kmsCadena = " + kmsCadena
                + "\n Estado cadena: " + comprobarEstadoCadena()
                + '}';
    }
}
