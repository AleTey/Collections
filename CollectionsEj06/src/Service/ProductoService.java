package Service;

import Identidad.Producto;
import static Identidad.Producto.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductoService {

    private final Scanner sc = new Scanner(System.in);
    HashMap<String, Double> productHashMap = new HashMap<>();

    public Producto crearProducto() {
        System.out.println("Ingrese nombre del producto");
        String producto = sc.nextLine();
        producto = sc.nextLine();
        System.out.println("Ingrese valor del producto");
        double valor = sc.nextDouble();

        productHashMap.put(producto, valor);

        return new Producto(producto, valor);
    }

    public void agregarProducto() {

        crearProducto();
        System.out.println(productHashMap.toString());
    }

    public void modificarPrecio() {

        boolean productoExiste = false;
        System.out.println("Ingrese nombre del producto");
        String producto = sc.nextLine();
        producto = sc.nextLine();
        for (Map.Entry<String, Double> entry : productHashMap.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            if (key.equalsIgnoreCase(producto)) {
                productoExiste = true;

                System.out.println("El precio actual de " + key + ": " + value);
                System.out.println("Ingrese nuevo precio");
                double newValue = sc.nextDouble();
                entry.setValue(newValue);

                System.out.println("Producto : " + entry.getKey() + "  precio : " + entry.getValue());
            }
        }
        if (!productoExiste) {
            System.out.println("El producto ingresado no existe");
        }
    }
    
    public void eliminarProducto() {
        
        System.out.println("Ingrese el producto que desea eliminar");
        String producto = sc.nextLine();
        producto = sc.nextLine();
        productHashMap.remove(producto);
    }

    public void mostrarProductos() {

        for (Map.Entry<String, Double> entry : productHashMap.entrySet()) {

            System.out.println("Producto : " + entry.getKey() + "  precio : " + entry.getValue());

        }
    }

    public void menu() {
        boolean exit = false;
        int option;
        while (exit == false) {

            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Ver productos");
            System.out.println("5. Salir");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    agregarProducto();
                    break;

                case 2:
                    modificarPrecio();
                    break;
                    
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? S/N");
                    String rta = sc.nextLine();
                    while (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n")) {
                        System.out.println("Ingrese s si desea salir, de lo contrario ingrese n");
                        rta = sc.nextLine();
                    }

                    if (rta.equalsIgnoreCase("s")) {
                        exit = true;
                    }

            }
        }
    }
}
