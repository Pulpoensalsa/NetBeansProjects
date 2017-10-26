/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioncolegio;

/**
 *
 * @author Alumnado
 */
public class Alumno {
    
       private static final int NUMERO_MAX_ASIGNATURAS = 5;
    
       private String nombre;
       private String apellido;
       private String dni;
       private Asignatura[] evaluacion1;
       private Asignatura[] evaluacion2;
       private Asignatura[] evaluacion3;
       private Asignatura[] evaluacionFinal;
       
       
       public Alumno (String nombre, String apellido, String dni)
       {
           this.nombre = nombre;
           this.dni = dni;
           this.apellido = apellido;
           evaluacion1 = new Asignatura[NUMERO_MAX_ASIGNATURAS];
           evaluacion2 = new Asignatura[NUMERO_MAX_ASIGNATURAS];
           evaluacion3 = new Asignatura[NUMERO_MAX_ASIGNATURAS];
           evaluacionFinal = new Asignatura[NUMERO_MAX_ASIGNATURAS];             
       }
       
       public void anadirNotasEvaluacion ( int numEvaluacion, double nota1, double nota2, double nota3, double nota4, double nota5)
       {
           switch(numEvaluacion)
           {
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   break;
               
           }
       }
       
       private void calcularNotaMedia ()
       {
            
       }
       
}
