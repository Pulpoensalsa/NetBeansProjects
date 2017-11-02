/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolegio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanPe
 */
public class Curso {
    
    private Alumno[] alumnos;
    private String nombreCurso;
    private int numeroAlumnos;
    
    public Curso( String nombre , int numAlumnos)
    {
        nombreCurso = nombre;
        numeroAlumnos = numAlumnos;
        alumnos = new Alumno [numeroAlumnos];
    }
    
    public void insertarNotasEvaluacionAlumno(int numEvaluacion)
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader (isr);
    
        for(int i=0; i < alumnos.length; i++)
        {
            try 
            {
                Alumno alumnoTmp = alumnos[i];
                System.out.println("Introduzca las notas del alumno "
                        + alumnoTmp.getNombre()+ " de la evaluacion "+numEvaluacion+" : ");
                Double nota1,nota2,nota3,nota4,nota5;
                System.out.println("Introduzca nota asignatura: "
                        + alumnoTmp.getAsignatura(0) +": " );
                nota1 = Double.parseDouble(buffer.readLine());
                System.out.println("Introduzca nota asignatura: "
                        + alumnoTmp.getAsignatura(1) +": " );
                nota2 = Double.parseDouble(buffer.readLine());
                System.out.println("Introduzca nota asignatura: "
                        + alumnoTmp.getAsignatura(2) +": " );
                nota3 = Double.parseDouble(buffer.readLine());
                System.out.println("Introduzca nota asignatura: "
                        + alumnoTmp.getAsignatura(3) +": " );
                nota4 = Double.parseDouble(buffer.readLine());
                System.out.println("Introduzca nota asignatura: "
                        + alumnoTmp.getAsignatura(4) +": " );
                nota5 = Double.parseDouble(buffer.readLine());
                
                alumnos[i].anadirNotasEvaluacionXAsignatura( numEvaluacion, nota1,
                        nota2, nota3, nota4, nota5);    
            } 
            catch (IOException ex) {
                Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void mostrarAlumnoMejorMedia()
    {
        
    }
}
