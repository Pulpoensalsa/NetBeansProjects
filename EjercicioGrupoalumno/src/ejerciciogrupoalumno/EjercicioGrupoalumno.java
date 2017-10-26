/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogrupoalumno;

/**
 *
 * @author JuanPe
 */
public class EjercicioGrupoalumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno[] arrayAlumnos = new Alumno[2];
        
        Alumno a1 = new Alumno("Pepe", "Romero", "23252627T", "7458125452");
        Alumno a2 = new Alumno("Chus", "Maragallo", "232578927T", "7458125452");
        
        arrayAlumnos[0] = a1;
        arrayAlumnos[1] = a2; 
        
        
        Grupo supercalifrasticoespialidoso = new Grupo("FPB1", arrayAlumnos);
        
        
        System.out.println(supercalifrasticoespialidoso.toString());
        
        
        

    
    }
    
}
