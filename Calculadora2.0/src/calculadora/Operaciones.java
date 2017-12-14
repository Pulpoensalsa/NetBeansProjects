/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author usuario
 */
public class Operaciones 
{
    private String numeros;
    private String numerosAnteriores;
    private String operacion;
    
    public Operaciones ()
    {
        numeros="";
        numerosAnteriores="";
        operacion="";
    }
    
    public void acumulaNumeros(String num)
    {
        numeros += num;
    }
    
    public String getNumeros()
    {
        return numeros;
    }
    
    public void siguienteNumero(String operador)
    {
        if( ! numeros.equals("") )
        {
            numerosAnteriores = numeros;
            numeros="";
        }
        operacion=operador;
    }
    
    public String calcularResultado()
    {
        String resultado="";
        Double num1 = Double.parseDouble(numerosAnteriores);
        Double num2 = Double.parseDouble(numeros);
        
        switch (operacion)
        {
            case "+":         
                Double res = num1 + num2;
                resultado = res.toString();
            break;
        }
        
        numerosAnteriores = resultado;
        numeros = "";
        operacion="";
        
        return resultado;
    }
    
    public void limpiarVariables()
    {
        numerosAnteriores="";
        numeros="";
        operacion="";
    }
    
}
