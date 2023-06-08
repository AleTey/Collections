
package Identidad;

public class Producto {

    public static Producto p(String taza, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    private String nombre;
    private double valor;
    private String material;

    public Producto() {
    }

    public Producto(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Producto(String nombre, double valor, String material) {
        this.nombre = nombre;
        this.valor = valor;
        this.material = material;
    }
    
    
}
