/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsej04;

import Identidad.Pelicula;
import Service.PeliculaService;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CollectionsEj04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PeliculaService ps = new PeliculaService();

        String rta;

        do {
            ps.agregarPeli();

            System.out.println("Cargar mas pelis? S/N");
            rta = sc.nextLine();

        } while (rta.equalsIgnoreCase("s"));

        ps.mostrarPeliculas();
        System.out.println("-----------------------------------------------------");
        System.out.println("Pelis de mas de una hora");
        ps.FiltroMasDeUnaHora();

        System.out.println("-------------------");
        ps.ordenarPorDuracion();
        System.out.println("PELICULAS ORDENADAS");
        ps.mostrarPeliculas();

        System.out.println("---------------------------");
        System.out.println("ORDEN INVERTIDO");
        ps.ordenarPorDuracionInvertida();
        ps.mostrarPeliculas();

        System.out.println("-----------------");
        System.out.println("ORDENAR PELIS POR TITULO");
        Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula t, Pelicula t1) {
                return t1.getTitulo().compareToIgnoreCase(t.getTitulo());
            }
        };
        Collections.sort(ps.getMovieList(), ordenarPorTitulo);
        Collections.reverse(ps.getMovieList());
        ps.mostrarPeliculas();
        
        System.out.println("-----------------");
        System.out.println("ORDEN ALFABETICO DIRECTOR");
        ps.ordenarAlfabetoDirector();
        ps.mostrarPeliculas();
        System.out.println("ORDEN ALFABETICO INVERTIDO");
        ps.ordenarAlfabetoDirectorInv();
        ps.mostrarPeliculas();
    }
}

