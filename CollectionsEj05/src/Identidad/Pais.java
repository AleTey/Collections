package Identidad;

import java.util.Comparator;

public class Pais {

    private String nombre;

    public Pais() {
    }

    public Pais(String pais) {
        this.nombre = pais;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override

    public String toString() {
        return "Pais{" + "pais=" + nombre + '}';
    }

    public static Comparator<Pais> compararPaises = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.nombre.compareToIgnoreCase(t1.nombre);
        }
    };

}
