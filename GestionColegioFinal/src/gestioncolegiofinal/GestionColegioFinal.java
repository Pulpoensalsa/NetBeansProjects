/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolegiofinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JuanPe
 */
public class GestionColegioFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader buffer = new BufferedReader (isr);
         
    	 Grupo grupo = new Grupo ("2GS");
    	
    	int valor=-1;
    	do
    	{
    		 switch (valor)
    		 {
    		 	case 1: 
                            grupo.pedirDatosGrupo();
    		 	break;
    		 	case 2:
                            System.out.println(" --- Introduza 1,2,3 para elegir evaluacion:");
                            int evaluacion = Integer.parseInt( buffer.readLine() );
                            grupo.introducirNotasXEvaluacion(evaluacion);
                        break;
    		 	case 3:
                            grupo.alumnoMejorNotaMedia();
    		 	break;
    		 	case 4:
                            grupo.mostrarAlumnosYNotas();
    		 	break;
    		 }
    		
    		 System.out.println("\n --- MENU GESTION COLEGIO --- ");
    		 System.out.println(" --- Introduzca 1 para crear grupo.");
    		 System.out.println(" --- Introduzca 2 para introducir notas evaluacion.");
    		 System.out.println(" --- Introduzca 3 para ver alumno mejor media.");
    		 System.out.println(" --- Introduzca 4 para ver todos los alumnos y notas");
    		 System.out.println(" --- Introduzca 0 para salir:");

      	 
        	 valor = Integer.parseInt( buffer.readLine() );
    	}
    	while (valor != 0);
    
//        Asignatura asi1= new Asignatura("Mat014", "Matematicas");
//        Asignatura asi2= new Asignatura("Len14", "Lengua");
//        
//        asi1.introducirNota(1 , 7.0);
//        asi1.introducirNota(2 , 3.0);
//        asi1.introducirNota(3 , 2.0);
//        
//        asi2.introducirNota(1 , 8.0);
//        asi2.introducirNota(2 , 3.0);
//        asi2.introducirNota(3 , 9.0);
//        
//        asi1.introducirNota(1, 5.0);
//        
//        
//        System.out.println( asi1.toString() );
//        System.out.println( asi2.toString() );
                
    
    }
    
}
