/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogrupoalumno;

/**
 *
 * @author JuanPe
 */
public class Grupo 
{
    private String codigoGrupo;
    private Alumno[] alumnos;
    
    public Grupo (String codigo, Alumno[] alumnos)
    {
        codigoGrupo = codigo;
        this.alumnos = alumnos;
    }

    @Override
    public String toString() 
    {
        String cadenaDevolver = "Grupo{" + "codigoGrupo=" + codigoGrupo + ", alumnos = \n" ;
        
        for (int i=0; i < alumnos.length; i++)
        {
            cadenaDevolver += alumnos[i].toString() + "\n";
        }
        
        cadenaDevolver += "}";
        return cadenaDevolver;
    }
}
