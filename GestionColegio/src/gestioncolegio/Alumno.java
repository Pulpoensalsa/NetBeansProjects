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

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }
    
       public static final int NUMERO_MAX_ASIGNATURAS = 5;
    
       private String nombre;
       private String apellido;
       private String dni;
       private Asignatura[] asignaturas;
       
       
       public Alumno (String nombre, String apellido, String dni)
       {
           this.nombre = nombre;
           this.dni = dni;
           this.apellido = apellido;
           asignaturas = new Asignatura[NUMERO_MAX_ASIGNATURAS];                      
       }
       
       public void anadirNotasEvaluacionXAsignatura ( int numEvaluacion, double nota1, double nota2, double nota3, double nota4, double nota5)
       {
           asignaturas[0].introducirNota(numEvaluacion, nota1);
           asignaturas[1].introducirNota(numEvaluacion, nota2);
           asignaturas[2].introducirNota(numEvaluacion, nota3);
           asignaturas[3].introducirNota(numEvaluacion, nota4);
           asignaturas[4].introducirNota(numEvaluacion, nota5);
       }
       
       public void anadirNota (int numEvaluacion, double nota1, int numAsignatura)
       {
           asignaturas[numAsignatura].introducirNota(numEvaluacion, nota1);
       }
       
      
       public Double calcularNotaMedia ()
       {
           Double notaMedia = 0.0;
           for (int i=0 ; i < asignaturas.length ; i++)
           {
               notaMedia += asignaturas[i].getNotaMedia();
           }
           
           return (notaMedia / asignaturas.length) ;
       }
       
       public String getAsignatura (int numAsig)
       {
           return asignaturas[numAsig].getNombreasi();
       }
       
}
