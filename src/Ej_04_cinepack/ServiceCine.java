/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej_04_cinepack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * • Mostrar en pantalla todas las películas. • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. • Ordenar las
 * películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 */
public class ServiceCine {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Peliculas> Listado = new ArrayList<>();
    String salir = "";

    public void InsertarPelicula() {

        do {
            System.out.println("Ingrese la duración de la pelicula");
            double duracion = leer.nextDouble();
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.next();
            System.out.println("Ingrese el nombre del director de la pelicula");
            String director = leer.next();

            Listado.add(new Peliculas(duracion, titulo, director));
            System.out.println("Usted quiere ingressar otra pelicula? N/S");
            salir = leer.next();
        } while (!salir.equalsIgnoreCase("N"));

        {
            for (Peliculas pelicula : Listado) {
                System.out.println(pelicula);
            }

        }

    }

    public void PeliHora() {
        System.out.println("\n\tPeliculas mayores a una hora");
        {
            for (Peliculas pelicula : Listado) {
                if (pelicula.getDuracion() > 1) {
                    System.out.println(pelicula);
                }
            }
        }

    }

    public void PeliMayor() {
        System.out.println("\n\tPeliculas de Mayor a menor duracion");
        Collections.sort(Listado, new Comparator<Peliculas>() {

            public int compare(Peliculas p1, Peliculas p2) {
                if (p1.getDuracion() < p2.getDuracion()) {
                    return 1;
                } else if (p1.getDuracion() > p2.getDuracion()) {
                    return -1;
                } else {
                    return 0;
                }

            }

        });
        {
            for (Peliculas pelicula : Listado) {
                if (pelicula.getDuracion() > 1) {
                    System.out.println(pelicula);
                }
            }
        }

    }

    public void PeliMenor() {
        System.out.println("\n\tPeliculas de Menor a mayor duracion");
        Collections.sort(Listado, new Comparator<Peliculas>() {

            public int compare(Peliculas p1, Peliculas p2) {
                if (p1.getDuracion() > p2.getDuracion()) {
                    return 1;
                } else if (p1.getDuracion() < p2.getDuracion()) {
                    return -1;
                } else {
                    return 0;
                }

            }

        });
        {
            for (Peliculas pelicula : Listado) {
                if (pelicula.getDuracion() > 1) {
                    System.out.println(pelicula);
                }
            }
        }

    }

    public void PeliAlf() {
        System.out.println("\n\tPeliculas por orden alfabetico");
        Collections.sort(Listado, new Comparator<Peliculas>() {

            public int compare(Peliculas p1, Peliculas p2) {

                return p1.getTitulo().compareTo(p2.getTitulo());

            }
        });
        for (Peliculas pelicula : Listado) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        
    }

    public void DirectorAlf() {
        System.out.println("\n\tDirectores por orden alfabetico");
        Collections.sort(Listado, new Comparator<Peliculas>() {

            public int compare(Peliculas p1, Peliculas p2) {

                return p1.getDirector().compareTo(p2.getDirector());

            }
        });
        for (Peliculas pelicula : Listado) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }

    }
}
