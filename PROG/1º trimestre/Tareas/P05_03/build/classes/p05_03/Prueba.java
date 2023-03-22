package p05_03;

/**
 *
 * @author alumno
 */
public class Prueba {

    class Buscador {

        boolean encontrado;
        int posicion;

        public Buscador(boolean encontrado, int posicion) {
            this.encontrado = encontrado;
            this.posicion = posicion;
        }
    }

    //estos son campos o aributos de la Clase.
    private int[] lista;
    private String nombre;
    private int factor;

    // Este es el constructor de la Clase que nos indica
    // cómo debemos añadirlo en el main.
    public Prueba(int tamanho, int f) {
        // Un array siempre se debe indicar su longitud.
        lista = new int[tamanho];
        factor = f;
    }

    //Final: indica que ese método no se puede sobreescribir,
    // o bien que ese método no permitirá más herencias de atributos.
    public void rellenarLista() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * getFactor());
        }
    }

    void vaciarLista() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = 0;
        }
    }

    int ValorMasAlto() {
        int masAlto = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > masAlto) {
                masAlto = lista[i];
            }
        }
        return masAlto;
    }

    int ValorMasBajo() {
        int masBajo = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < masBajo) {
                masBajo = lista[i];
            }
        }
        return masBajo;

    }

    void imprimirLista() {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }

    /**
     *
     * @param buscado número a buscar.
     * @return array de dos posiciones 1º posición: 1 -> si lo encuentra, 0 -> si no lo encuentra. 2º posición: si lo
     * encuentra, indica la posición.
     */
    int[] contiene(int buscado) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == buscado) {
                return new int[]{1, i + 1};
            }
        }
        return new int[]{0, 0};
    }

    Buscador contiene2(int buscado) {
        for (int i = lista.length - 1; i >= 0; i--) {
            if (lista[i] == buscado) {
                return new Buscador(true, i + 1);
            }
        }
        return new Buscador(false, 0);
    }

    int[] devolverValoresMayorYMenor() {
        //int[] masAB = {lista[0], lista[0]}
        int masBajo = lista[0], masAlto = lista[0];
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < masBajo) {
                masBajo = lista[i];

            } else if (lista[i] > masAlto) {
                masAlto = lista[i];
            }
        }
        return new int[]{masAlto, masBajo};
    }

    void ordenarLista() {
        int aux;
        for (int i = 0; i < lista.length - 1; i++) {
            boolean ordenada = true;
            for (int j = 0; j < lista.length - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    aux = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = aux;
                    ordenada = false;
                }
            }
            if (ordenada) {
                break;
            }
        }
    }

    /**
     * @return the nombre
     */
    // Get: devuelve el valor, permite leer.
    // Set: introduce el valor, permite modificar el valor.
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the factor
     */
    public int getFactor() {
        return factor;
    }

    public Prueba(int[] lista, String nombre, int factor) {
        this.lista = lista;
        this.nombre = nombre;
        this.factor = factor;
        //Rellenar la lista automáticamente.
        rellenarLista();
    }

}
