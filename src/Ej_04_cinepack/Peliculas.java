/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_04_cinepack;

/**
 *
 * @author LENOVO
 */
public class Peliculas {
    
    private Double duracion;
    private String titulo;
    private String director;

  
   

    public Peliculas(Double duracion, String titulo, String director) {
        this.duracion = duracion;
        this.titulo = titulo;
        this.director = director;
    }
   
    
      public Double getDuracion() {
        return duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracion=" + duracion + ", titulo=" + titulo + ", director=" + director + '}';
    }
    
        
    
}