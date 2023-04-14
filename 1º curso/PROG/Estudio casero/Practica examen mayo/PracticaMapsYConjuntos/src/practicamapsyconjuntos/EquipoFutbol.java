/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicamapsyconjuntos;

import java.util.Objects;

/**
 *
 * @author alumno
 */
class EquipoFutbol implements Comparable<EquipoFutbol> {

    String nombre;
    int cantidadJugadores;
    int numeroTitulos;
    String fechaFundacion;

    public EquipoFutbol(String nombre, int cantidadJugadores, int numeroTitulos, String fechaFundacion) {
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
        this.numeroTitulos = numeroTitulos;
        this.fechaFundacion = fechaFundacion;
    }

    @Override
    public String toString() {
        return "EquipoFutbol{" + "nombre=" + nombre
                + ", cantidadJugadores=" + cantidadJugadores
                + ", numeroTitulos=" + numeroTitulos
                + ", fechaFundacion=" + fechaFundacion + '}';
    }

    /**
     *
     */
    @Override
    public int compareTo(EquipoFutbol o) {
//        return numeroTitulos - o.numeroTitulos;
        return nombre.compareTo(o.nombre);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + this.numeroTitulos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EquipoFutbol other = (EquipoFutbol) obj;
        if (this.numeroTitulos != other.numeroTitulos) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
