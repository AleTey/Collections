
package Identidad;

import java.util.ArrayList;
import java.util.Comparator;

public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracion;
    private ArrayList genero;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula(String titulo, String director, int duracion, ArrayList genero) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    
    

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
    
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>(){
    
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
    
             double duracionP1 = p1.getDuracion();
        double duracionP2 = p2.getDuracion();

        if (duracionP1 < duracionP2) {
            return -1;
        } else if (duracionP1 > duracionP2) {
            return 1;
        } else {
            return 0;
        }
                    
        }
    };
    
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
       
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.director.compareToIgnoreCase(t1.director);
        }
    };
    
}
