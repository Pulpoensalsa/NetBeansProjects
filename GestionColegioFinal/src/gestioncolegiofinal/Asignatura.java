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
public class Asignatura {

    public static final int NUMERO_CALIFICACIONES = 4;
    
    private String codigoasi;
    private String nombreasi;
    private Double[] calificaciones;

     public Asignatura() {
        this.codigoasi = "";
        this.nombreasi = "";
        this.calificaciones = new Double[NUMERO_CALIFICACIONES];    
    }
    
    public Asignatura(String codigoasi, String nombre) {
        this.codigoasi = codigoasi;
        this.nombreasi = nombre;
        this.calificaciones = new Double[NUMERO_CALIFICACIONES];  
    }

    public void introducirNota(int numeroEvaluacion, Double nota)
    {
        switch(numeroEvaluacion)
        {
            case 1:
                calificaciones[0] = nota;       // Primera evaluacion
            break;
            case 2:
                calificaciones[1] = nota;       // Segunda evaluacion
            break;
            case 3:
            	calificaciones[2] = nota;
            break;
        }
        
        calificaciones[3] = 0.0;
        
        if (calificaciones[0] != null 
                && calificaciones[1] != null 
                && calificaciones[2] != null)
        hacerMedia();

    }
    
    private void hacerMedia()
    {
        Double acumulador=0.0;
        
        for( int i=0; i < NUMERO_CALIFICACIONES - 1; i++)
        {
        	if (calificaciones[i] != null)
        		acumulador += calificaciones[i];  //acumulador = acumulador + calificaciones[i]  
        }
        calificaciones[3] = acumulador/ 3.0 ;
    }
    
    public double getNotaMediaAsignatura()
    {
    	return calificaciones[3];
    }

    @Override
    public String toString() 
    {
        String cadena="";
        cadena = "Asignatura{" + "codigoasi=" + codigoasi + ", nombreasi=" + nombreasi + ", ";
        for(int i = 0; i < NUMERO_CALIFICACIONES;i++)
        {
            cadena +=  "\n Evaluacion" + (i+1) + "="+ calificaciones[i] ;
        }
        cadena += "\n }";
        return cadena;
    }
    
    
    /**
     * @return the codigoasi
     */
    public String getCodigoasi() {
        return codigoasi;
    }

    /**
     * @param codigoasi the codigoasi to set
     */
    public void setCodigoasi(String codigoasi) {
        this.codigoasi = codigoasi;
    }

    /**
     * @return the nombreasi
     */
    public String getNombreasi() {
        return nombreasi;
    }

    /**
     * @param nombreasi the nombreasi to set
     */
    public void setNombreasi(String nombreasi) {
        this.nombreasi = nombreasi;
    }

   

}
