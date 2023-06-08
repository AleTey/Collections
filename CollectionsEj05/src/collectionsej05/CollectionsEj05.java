/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collectionsej05;

import GUI.Pantalla;
import Service.PaisService;


public class CollectionsEj05 {


    public static void main(String[] args) {

//        Pantalla pantalla = new Pantalla();
        PaisService ps = new PaisService();
        
//        pantalla.setVisible(true);
//        pantalla.setLocationRelativeTo(null);
        
        ps.agregarPais();
        ps.mostrarCountryList();
        System.out.println("--------------------------");
        System.out.println("CONVERTIR/ORDENAR/CONVERTIR/MOSTRAR");
        ps.convertirOrdenarConvertirMostrar();
        System.out.println("------mostrarCountryList");
        ps.mostrarCountryList();
        System.out.println("---------------------------");
        
//        System.out.println("=======");
//        System.out.println(ps.getPaisesArray().toString());

        System.out.println("----------------");
        System.out.println("BUSCAR ELIMINAR PAIS");
        ps.buscarEliminar();
        ps.mostrarCountryListLHS();
    }

}
