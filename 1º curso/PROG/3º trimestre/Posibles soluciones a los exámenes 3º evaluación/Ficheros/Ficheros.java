/*

 */
package ficheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Amador Abelleira Gómez
 */
public class Ficheros {

    static Scanner tec = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datos = "datos.dat";
        boolean hayDatos = false;
        ObjectInputStream fe = null;
        try {
            fe = new ObjectInputStream(new FileInputStream(datos));
            hayDatos = true;
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            System.out.println("Se produjo un error leyendo los dados\n"
                    + "?Quiere continuar? En caso afirmativo el fichero será sobreecrito (s/n");
            if (!"s".equals(tec.nextLine().toLowerCase())) {
                System.exit(0);
            }
        }
        ArrayList<Factura> facturas = null;
        if (hayDatos) {
            try {
                Object ob = fe.readObject();
                if (ob != null) {
                    facturas = (ArrayList<Factura>) ob;
                } else {
                    facturas = new ArrayList<>();
                }
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println("Se produjo un error leyendo los dados\n"
                        + "?Quiere continuar? En caso afirmativo el fichero será sobreecrito (s/n");
                if (!"s".equals(tec.nextLine().toLowerCase())) {
                    System.exit(0);
                }
            }
        }
        if (facturas == null) {
            facturas = new ArrayList<>();
        }

        while (true) {
            System.out.println("1- crear nueva factura (incluyendo sus líneas de detalle)\n"
                    + "2- Listar toda las facturas (sin líneas de detatlle)\n"
                    + "3- Mostra información factura (con líneas detalle)\n"
                    + "4- Eliminar factura (incluyebndo líneas detalle\n"
                    + "5- Salir");
            int opcion;
            do {
                opcion = Integer.parseInt(tec.nextLine());
            } while (opcion < 1 || opcion > 6);
            switch (opcion) {
                case 1:
                    crearFacturas(facturas);
                    break;
                case 2:
                    listarFacturas(facturas);
                    break;
                case 3:
                    mostrarFactura(facturas);
                    break;
                case 4:
                    eliminarFactura(facturas);
                    break;
                case 5: {
                    ObjectOutputStream fs = null;
                    try {
                        fs = new ObjectOutputStream(new FileOutputStream(datos));
                    } catch (IOException ex) {
                        System.out.println("Error Abriendo fichero para grabar\n"
                                + "Abortando grabación");
                        System.exit(0);
                    }
                    try {
                        fs.writeObject(facturas);
                    } catch (IOException ex) {
                        System.out.println("Error grabando datos");
                    }
                    System.exit(0);
                }

            }
        }
    }

    private static void crearFacturas(ArrayList<Factura> facturas) {
        while (true) {
            System.out.println("Introducir Facturas (número de factura en blanco para finalizar)");
            System.out.print("Número Factura: ");
            String numeroFactura = tec.nextLine();
            if (numeroFactura.isBlank()) {
                break;
            }
            System.out.print("Fecha emisión: ");
            String fechaEmision = tec.nextLine();
            System.out.print("DNI cliente: ");
            String dniCliente = tec.nextLine();
            System.out.print("Dirección facturación: ");
            String direccionFacturacion = tec.nextLine();
            facturas.add(new Factura(numeroFactura, fechaEmision,
                    0.0,
                    direccionFacturacion, dniCliente, new ArrayList()));
            System.out.println(
                    "Introducir línea de detalle (Código producto en blanco para finalziar)");
            while (true) {
                System.out.print("Código producto: ");
                String codigoProducto = tec.nextLine();
                if (codigoProducto.isBlank()) {
                    break;
                }
                System.out.print("Descripción: ");
                String descripcion = tec.nextLine();
                System.out.print("Precio unitario: ");
                double precioUnitario = Double.parseDouble(tec.nextLine());
                System.out.print("Unidades: ");
                int unidades = Integer.parseInt(tec.nextLine());
                System.out.print("%IVA: ");
                int iva = Integer.parseInt(tec.nextLine());
                facturas.get(facturas.size() - 1).getLineasDetalle().add(
                        new LineaDetalle(codigoProducto, descripcion, precioUnitario,
                                unidades, iva));
            }
            Double importeTotal = 0.0;
            for (LineaDetalle elto : facturas.get(facturas.size() - 1).getLineasDetalle()) {
                importeTotal += elto.getTotal();
            }
            facturas.get(facturas.size() - 1).setImporteTotal(importeTotal);
        }
    }

    private static int seleccionarFactura(ArrayList<Factura> facturas) {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas introducidas");
            return -1;
        }
        System.out.print("Qué factura quieres (1-" + facturas.size() + "): ");
        int posicion = Integer.parseInt(tec.nextLine()) - 1;
        if (posicion < 0 || posicion >= facturas.size()) {
            System.out.println("No existe esa factura");
            return -1;
        }
        return posicion;
    }

    private static void eliminarFactura(ArrayList<Factura> facturas) {
        int posicion = seleccionarFactura(facturas);
        if (posicion < 0) {
            return;
        }
        facturas.remove(posicion);
        System.out.println("Factura borrado\n");
    }

    private static void mostrarFactura(ArrayList<Factura> facturas) {
        int posicion = seleccionarFactura(facturas);
        if (posicion < 0) {
            return;
        }
        int cont = 1;
        System.out.println("FACTURA: ");
        System.out.println(facturas.get(posicion));
        System.out.println("----Detalle----");
        for (LineaDetalle elto : facturas.get(posicion).getLineasDetalle()) {
            System.out.println(cont++ + "- " + elto);
        }
        System.out.println("");
    }

    private static void listarFacturas(ArrayList<Factura> facturas) {
        if (facturas.isEmpty()) {
            System.out.println("No hay facturas introducidas");
            return;
        }
        System.out.println("Escoge criterio de ordenación: \n"
                + "1 Número de factura\n"
                + "2 DNI cliente\n"
                + "3 Importe factura");
        int opcion;
        do {
            opcion = Integer.parseInt(tec.nextLine());
        } while (opcion < 1 || opcion > 4);
        switch (opcion) {
            case 1:
                Collections.sort(facturas);
                break;
            case 2:
                Collections.sort(facturas, new OrdenPorDNI());
                break;
            case 3:
                Collections.sort(facturas, new OrdenPorImpotte());
                break;
        }
        System.out.println("--------- LISTADO DE FACTURAS  -------------------");
        int cont = 1;
        for (Iterator it = facturas.iterator(); it.hasNext();) {
            System.out.println(cont++ + "- " + it.next());
        }
        System.out.println("");
    }
}
