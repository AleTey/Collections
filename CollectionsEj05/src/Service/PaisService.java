package Service;

import Identidad.Pais;
import static Identidad.Pais.compararPaises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PaisService {

    private final Scanner sc = new Scanner(System.in);
    HashSet<Pais> countryList = new HashSet();
    LinkedHashSet<Pais> countryListLHS = new LinkedHashSet<>();

    public Pais crearPais() {
        System.out.println("Ingrese nombre del Pais");
        String nombrePais = sc.nextLine();

        return new Pais(nombrePais);
    }

    public void agregarPais() {
        String rta = "n";
        
        do {
            boolean rtaCorrecta = false;
            countryList.add(crearPais());
            while (!rtaCorrecta) {
                try {
                    
                    System.out.println("Desea agregar otro pais? S/N");
                    rta = sc.nextLine();
                    rtaCorrecta = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ingrese valor valido");
                    sc.nextLine();
                }
            }
        } while (rta.equalsIgnoreCase("s"));
    }

    public void mostrarCountryList() {
        for (Pais pais : countryList) {
            System.out.println(pais + " " + pais.hashCode());
        }
    }
      
    public void convertirOrdenarConvertirMostrar() {
        ArrayList<Pais> paisesArray = new ArrayList<>(countryList);
        Collections.sort(paisesArray, compararPaises);
        countryList.clear();
        countryList.addAll(paisesArray);
        countryListLHS.addAll(paisesArray);
        System.out.println("PAISES DE LA LISTA");
        for(Pais nPaises : paisesArray) {
            System.out.println(nPaises);
        }
        System.out.println("Dentro de metodo convertirOrdenar... HashList");
        for (Pais lPaises : countryList) {
            System.out.println(lPaises);
        }
        
        System.out.println("LINKED HASH LIST");
        System.out.println(countryListLHS);
        
    }
    
    public void buscarEliminar() {
        
        System.out.println("Ingrese el pais que desea eliminar de la lista");
        String paisEliminar = sc.nextLine();
        
        Iterator<Pais> ip = countryListLHS.iterator();
        int cont = 0;
        while (ip.hasNext()) {
            if (ip.next().getNombre().equalsIgnoreCase(paisEliminar)) {
                ip.remove();
                System.out.println("El pais se eslimino correctamente de la lista");
                cont ++;
            }
        }
        if (cont == 0) {
            System.out.println("El pais no fue encontrado en la lista");
        }
        
    }
    
    public void mostrarCountryListLHS() {
        System.out.println(countryListLHS);
    }

  
}
