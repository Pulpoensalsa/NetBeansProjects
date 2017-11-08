package gestioncolegiofinal;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alumnado
 */
public class Alumno {
    
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
       
       public boolean crearAsignaturasAlumno( String codigoasi, String nombre )
       {    	   
    	   for (int i=0 ; i < asignaturas.length; i++ )
    	   {
    		   if ( asignaturas[i] == null )
    		   {
    			   asignaturas[i] = new Asignatura (codigoasi, nombre);
    			   return true;
    		   }
    	   }
    	   return false;
       }
       
       
       public void anadirNotasEvaluacion ( int numEvaluacion, double notaAsig1, double notaAsig2
    		   ,double notaAsig3, double notaAsig4, double notaAsig5 )
       {
    	   asignaturas[0].introducirNota( numEvaluacion, notaAsig1);
    	   asignaturas[1].introducirNota( numEvaluacion, notaAsig2); 
    	   asignaturas[2].introducirNota( numEvaluacion, notaAsig3); 
    	   asignaturas[3].introducirNota( numEvaluacion, notaAsig4); 
    	   asignaturas[4].introducirNota( numEvaluacion, notaAsig5);
       }
       
       
       public double calcularNotaMediaTodasAsignaturas()
       {
    	   double acumulador=0.0;
    	   double notaMediaTotal=0.0;
    	   
    	   for (int i=0 ; i < asignaturas.length; i++ )
    	   {
    		   if ( asignaturas[i] != null)
    		   {
    			   acumulador += asignaturas[i].getNotaMediaAsignatura();
    		   }
    	   }
    	   
    	   notaMediaTotal = acumulador / NUMERO_MAX_ASIGNATURAS;
    	   
    	   return notaMediaTotal;
       }
       
       public String getNombreAsignatura(int posicion)
       {
    	   return asignaturas[posicion].getNombreasi();
       }
       
       public String toString()
       {
    	   String cadena = "Nombre: " + nombre + " " + apellido + " con dni: " + dni + "\n";
    	   
    	   for (int i=0 ; i < asignaturas.length; i++ )
    	   {
    		   cadena += asignaturas[i].toString();
    	   }
    	   
    	   return cadena;
       }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
