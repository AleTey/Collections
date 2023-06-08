package Service;

import Identidad.Pelicula;
import static Identidad.Pelicula.compararDirector;
import static Identidad.Pelicula.compararDuracion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

    private final Scanner sc = new Scanner(System.in);
    ArrayList<Pelicula> movieList = new ArrayList<>();

    public Pelicula crearPelicula() {
        String masPelis = "n";

        System.out.println("Ingrese titulo de la peli");
        String titulo = sc.nextLine();

        System.out.println("Ingrese director de la pelicula");
        String director = sc.nextLine();

        System.out.println("Ingrese duracion de la pelicula en horas");
        int duracion = sc.nextInt();
        sc.nextLine();

        System.out.println("Desea agregar generos de la pelicula? (S/N) estos se guardaran en una lista nueva");
        String rta = sc.nextLine();

        ArrayList<String> listaGeneros = new ArrayList<>();

        if (rta.equalsIgnoreCase("s")) {
               
            System.out.println("Cuantos generos desea agregar");
            int cant = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < cant; i++) {
                System.out.println("Ingrese genero " + i + 1);
//                String genero = sc.nextLine();
//                sc.next();
                String genero = sc.nextLine();
                listaGeneros.add(genero);
            }
        }

        return new Pelicula(titulo, director, duracion, listaGeneros);
    }

    public void agregarPeli() {
        movieList.add(crearPelicula());
    }

    public void mostrarPeliculas() {
        for (Pelicula pelisDeLista : movieList) {
            System.out.println(pelisDeLista);
        }
    }

    public void FiltroMasDeUnaHora() {
        for (Pelicula peli : movieList) {
            if (peli.getDuracion() >= 1) {
                System.out.println(peli);
            }

        }
    }

    public void ordenarPorDuracion() {
        Collections.sort(movieList, compararDuracion);

    }

    public void ordenarPorDuracionInvertida() {
        Collections.sort(movieList, compararDuracion);
        Collections.reverse(movieList);
    }

    public ArrayList<Pelicula> getMovieList() {
        return movieList;
    }

    public void ordenarAlfabetoDirector() {
        Collections.sort(movieList, compararDirector);
    }

    public void ordenarAlfabetoDirectorInv() {
        Collections.reverse(movieList);
    }
    
}
