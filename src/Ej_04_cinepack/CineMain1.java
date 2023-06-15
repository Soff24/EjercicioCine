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
public class CineMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ServiceCine Peli = new ServiceCine ();
     
     Peli.InsertarPelicula();
     Peli.PeliHora();
     Peli.PeliMayor();
     Peli.PeliMenor();
     Peli.PeliAlf();
     Peli.DirectorAlf();
    }
    
}
