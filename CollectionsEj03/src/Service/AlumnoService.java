
package Service;

import Identidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    
    Scanner sc = new Scanner(System.in);
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public void crearAlumnos() {
        
       
        
        String masAlumnos = "si";
        while (masAlumnos.equalsIgnoreCase("si")) {
            System.out.println("Ingrese nombre del alumno");
            String nombreAlumno = sc.nextLine();
            
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota " + (i + 1) + " del alumno");
                int nota = sc.nextInt();
                sc.nextLine();
                notas.add(nota);
            }
            
            Alumno alumno = new Alumno(nombreAlumno, notas);
            listaAlumnos.add(alumno);
            
            System.out.println("Desea agregar otro alumno?");
            masAlumnos = sc.nextLine();
        }
    
    }
    
    public void mostrarAlumnos() {
        
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.println(listaAlumnos.get(i));
        }
    }
    
    public double notaFinal() {
        
        System.out.println("Ingrese nombre del alumno");
        String nombreAlumno = sc.nextLine();
        int suma = 0;
        for (Alumno alumno : listaAlumnos) {
            
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                
                List<Integer> notas = alumno.getNotas();
                for (int nota : notas) {
                    
                    suma += nota;
                }
            }else {
                System.out.println("El alumno no se encuentra en la lista");
                return promedio(suma);
                
            }
        }
        
        return suma / 3;
    }
    
    public double promedio(int suma) {
    
        return suma / 3;
    }
}
