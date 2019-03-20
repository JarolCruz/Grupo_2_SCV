
package tareagrupal1;

import java.util.Scanner;

/**
 *
 * @author PC-DESKTOP
 */
public class Estudiante {
    
    Scanner i = new Scanner(System.in);
    
    public int curso;
    protected String instituto, alumno;
    
    public void nombreEstudiante(){
        System.out.print("Nombre Alumno: ");
        alumno = i.toString();
        
    }
    public void instituto() {
        
        System.out.print("Instituto: ");
        instituto = i.toString();
        
    }
    public void Curso() {
       
        System.out.print("Digite en Grado de Estudio: ");
        curso = i.nextInt(); 
        
        if(curso < 6){
            System.out.print("Nombre del Alumno: " + alumno);
            System.out.print("Nombre del Instituto: " + instituto);
            System.out.print("Grado de primaria que cursa: " + curso);
            
        }   else if(curso > 6 ){
            System.out.print("Nombre del Alumno: " + alumno);
            System.out.print("Nombre del Instituto: " + instituto);
            System.out.print("Grado de Secundaria que cursa: " + curso);
            
        }
        
    }
    
}
