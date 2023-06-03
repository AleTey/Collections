/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacollectionsej01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class JavaCollectionsEj01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList();
        
        String rta = "si";
        int cont = 0;
        
        while (rta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese una raza");
            
            raza.add(sc.nextLine());
            cont ++;
            System.out.println("Desea ingresar otra?");
            rta = sc.nextLine();
        }
        
        System.out.println(raza);
        System.out.println(raza.size());
        
        System.out.println("Ingrese la raza que desea eliminar de la lista");
        String eliminarRaza = sc.nextLine();
        
        Iterator<String> iterador = raza.iterator();
        
        while (iterador.hasNext()) {
//            String razaAEliminar = iterador.next();
            if (iterador.next().equals(eliminarRaza)) {
                iterador.remove();
            }
        }
        System.out.println(raza);
    }

}
