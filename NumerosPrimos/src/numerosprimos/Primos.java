/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

/**
 *
 * @author JuanPe
 */

public class Primos 
{
    private static boolean contador;

    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        boolean chivato = false;
        
        for (int i = 1; i < 10; i++) 
        {
            for (int j = i-1; j > 1; j--) 
            {
                int resto = i%j;
                if (resto == 0) 
                {
                    break;
                } 
                else 
                { 
                    chivato = true;
                }
            }
            
            if (chivato == true) 
            {
                System.out.println(i);
            }
        }
    }
}
