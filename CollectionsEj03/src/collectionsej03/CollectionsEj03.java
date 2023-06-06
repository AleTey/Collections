
package collectionsej03;

import Service.AlumnoService;


public class CollectionsEj03 {


    public static void main(String[] args) {

        AlumnoService as = new AlumnoService();
        as.crearAlumnos();
        
        System.out.println();
        
        as.mostrarAlumnos();
        
        System.out.println(as.notaFinal());
        as.mostrarAlumnos();
    }

}
