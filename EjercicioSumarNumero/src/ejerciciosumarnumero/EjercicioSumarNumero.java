/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosumarnumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JuanPe
 */
public class EjercicioSumarNumero {

    public static boolean isNumeric(String s) {  
        return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int sumaTotal = 0;
        boolean condicion = true;
        int numero = 0;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader (isr);
        
        String respuesta = "";
        
        do
        {
            System.out.println("¿Desea sumar un numero? Introduzca y/n: ");
            respuesta = buffer.readLine();
            
            if (respuesta.equals("y"))
            {
                System.out.println("Introduzca el número a sumar, please: ");
                String numeroTemp = buffer.readLine();
                
                if( isNumeric(numeroTemp) )
                {
                    numero = Integer.parseInt(buffer.readLine());
                    sumaTotal += numero;
                }
                else
                {
                    System.out.println("No ha introducido un número!!1 Intentelo de nuevo");
                }
            }
            else if (respuesta.equals("n"))
            {
                condicion = false;
            }
            else
            {
                System.out.println("Perdone, ha escogido una opción incorrecta!");
            }
        }
        while (condicion);
        
        
        System.out.println("La suma total ha sido: " + sumaTotal);

    }
    
    
   
    
}
