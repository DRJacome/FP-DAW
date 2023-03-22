/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.david.practicarecu11librosfx;

/**
 *
 * @author alumno
 */
public class Libro implements Comparable<Libro> {

    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private int anhoPublicacion;
    private double precio;

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the numeroPaginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * @return the anhoPublicacion
     */
    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }

    /**
     * @param anhoPublicacion the anhoPublicacion to set
     */
    public void setAnhoPublicacion(int anhoPublicacion) {
        this.anhoPublicacion = anhoPublicacion;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numeroPaginas, int anhoPublicacion, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.anhoPublicacion = anhoPublicacion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return isbn + " "
                + titulo + " "
                + autor + " "
                + numeroPaginas + " "
                + anhoPublicacion + " "
                + precio;
    }

    @Override
    public int compareTo(Libro t) {
        return this.autor.compareTo(t.autor);
    }
}
