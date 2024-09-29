
package com.mycompany.proyecto.ejerciciodos;


public class Nodo {

    /**
     * @return the numeroDeBoletas
     */
    public int getNumeroDeBoletas() {
        return numeroDeBoletas;
    }

    /**
     * @param numeroDeBoletas the numeroDeBoletas to set
     */
    public void setNumeroDeBoletas(int numeroDeBoletas) {
        this.numeroDeBoletas = numeroDeBoletas;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the pelicula
     */
    public String getPelicula() {
        return pelicula;
    }

    /**
     * @param pelicula the pelicula to set
     */
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the enlace
     */
    public Nodo getEnlace() {
        return enlace;
    }

    /**
     * @param enlace the enlace to set
     */
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
     private String id;
     private String nombre;
     private String fecha;
     private String pelicula;
     private char sexo;
     private int numeroDeBoletas;
     private Nodo enlace;

    @Override
    public String toString() {
        return "Cliente: " + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + ", pelicula=" + pelicula + ", sexo=" + sexo + ", numeroDeBoletas=" + numeroDeBoletas ;
    }
     
     
}
