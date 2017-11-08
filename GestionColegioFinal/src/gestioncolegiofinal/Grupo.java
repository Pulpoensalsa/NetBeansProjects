package gestioncolegiofinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Grupo 
{
	
	 private static final int NUMERO_MAX_ALUMNOS = 2;
	    
     private String nombreGrupo;
     private Alumno[] alumnos;
     
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader buffer = new BufferedReader (isr);
     
     public Grupo (String nombre)
     {
         this.nombreGrupo = nombre;
         alumnos = new Alumno[NUMERO_MAX_ALUMNOS];             
     }
     
     public void pedirDatosGrupo( ) throws IOException
     {
    	 System.out.println(" --- Antes de introducir los datos de los alumnos, ");
    	 System.out.println(" --- necesitamos saber que asignaturas se van a impartir: ");
    	 
    	 Asignatura[] asignaturas = new Asignatura[Alumno.NUMERO_MAX_ASIGNATURAS];
    	 
    	 for (int i=0; i < Alumno.NUMERO_MAX_ASIGNATURAS; i++ )
    	 {
        	 System.out.print(" --- Introduzca nombre asignatura "+i+": ");
        	 String nombre = buffer.readLine();
        	 System.out.print(" --- Introduzca codigo asignatura "+i+": ");
        	 String codigo = buffer.readLine();
        	 
        	 asignaturas[i] = new Asignatura(codigo, nombre);
        	 
        	 System.out.println("\n");
    	 }
    	 
    	 System.out.println(" --- Ahora vamos a introducir los datos de los alumnos: ");
    	 
    	 
    	 for (int i=0; i < NUMERO_MAX_ALUMNOS; i++ )
    	 {
        	 System.out.print(" --- Introduzca nombre alumno "+i+": ");
        	 String nombre = buffer.readLine();
        	 System.out.print(" --- Introduzca apellido del alumno"+i+": ");
        	 String apellido = buffer.readLine();
        	 System.out.print(" --- Introduzca dni del alumno "+i+": ");
        	 String dni = buffer.readLine();
        	 
        	 alumnos[i] = new Alumno(nombre, apellido, dni);
        	 
        	 //Y ahora para dejar al alumno bien finiquitado debemos meterle todas las asignaturas
        	 //que tiene (que en este caso, todos los alumnos tienen las mismas asignaturas)
        	 
        	 //Aqui le estamos creando las 5 asignaturas a cada alumnos:
        	 for (int j=0; j < asignaturas.length; j++ )
        	 {
            	 alumnos[i].crearAsignaturasAlumno(asignaturas[j].getCodigoasi(), asignaturas[j].getNombreasi());
        	 }
        	 
        	 System.out.println("\n");
    	 }
     }

     public void introducirNotasXEvaluacion(int numEvaluacion) throws NumberFormatException, IOException
     {
    	 System.out.println(" -- INTRODUCIR NOTAS EVALUACION NUMERO "+numEvaluacion+" --");
    	 
    	 for (int i=0; i < NUMERO_MAX_ALUMNOS; i++ )
    	 {
        	 System.out.println(" --- Introduzca notas para alumno "+ alumnos[i].getNombre()+": ");
        	 
        	 double[] notas = new double[Alumno.NUMERO_MAX_ASIGNATURAS];
        	 
        	 for (int j=0; j < Alumno.NUMERO_MAX_ASIGNATURAS; j++ )
        	 { 
        		 System.out.print(" --- Introduzca nota asignatura "+ alumnos[i].getNombreAsignatura(j)+": ");
        		 notas[j] = Double.parseDouble( buffer.readLine() );
        	 }
        	 
        	 //Y ahora que ya hemos pedido las notas de todas las asignaturas se las introducimos al
        	 //alumnos dado.
        	 
        	 alumnos[i].anadirNotasEvaluacion(numEvaluacion, notas[0], notas[1], notas[2], notas[3], notas[4]);
    	 }
     }
     
     public void alumnoMejorNotaMedia ()
     {
    	 int posicionMejorNota=0;
    	 double notaTmp=0;
    	 
    	 for (int i=0; i < NUMERO_MAX_ALUMNOS; i++ )
    	 {
    		 if ( notaTmp < alumnos[i].calcularNotaMediaTodasAsignaturas())
    		 {
    			 notaTmp = alumnos[i].calcularNotaMediaTodasAsignaturas();
    			 posicionMejorNota = i;
    		 }
    	 }
    	 
    	 System.out.println(" --- EL ALUMNO CON MEJOR NOTA MEDIA HA SIDO: \n");
    	 System.out.println( alumnos[posicionMejorNota].toString() + "\n");
     }
     
     public void mostrarAlumnosYNotas()
     {
    	 for (int i=0; i < NUMERO_MAX_ALUMNOS; i++ )
    		 System.out.println( alumnos[i].toString() );
     }
}
