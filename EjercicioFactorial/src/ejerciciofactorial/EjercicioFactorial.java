/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author JuanPe
 */
public class EjercicioFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader (isr);
        
        Double numero;
        String cadena;
        boolean condicion = true;
        
        do
        {
            System.out.println("Please, introduce el número de factorial:");
            cadena = buffer.readLine();
            numero = Double.parseDouble(cadena);
            
            if( numero % 1 != 0  || numero < 0)
            {
                System.out.println("El numero introducido no es positivo o entero");
                condicion = false;
            }
            else
                condicion = true;
        }
        while (condicion == false);
        
        int resultado = 1;
        
        for (int i = 1; i <= numero; i++)
        {   
            System.out.print( "------ " + resultado + " x " + i + " = " );
            resultado = resultado * i;
            System.out.println (resultado);
            
        }
        
        System.out.println ("\n El resultado es: " + resultado);
    }
    
}
