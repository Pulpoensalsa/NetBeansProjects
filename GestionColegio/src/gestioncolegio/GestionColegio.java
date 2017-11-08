/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncolegio;

/**
 *
 * @author JuanPe
 */
public class GestionColegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Asignatura asi1= new Asignatura("Mat014", "Matematicas");
        Asignatura asi2= new Asignatura("Len14", "Lengua");
        
        asi1.introducirNota(1 , 7.0);
        asi1.introducirNota(2 , 3.0);
        asi1.introducirNota(3 , 2.0);
        
        asi2.introducirNota(1 , 8.0);
        asi2.introducirNota(2 , 3.0);
        asi2.introducirNota(3 , 9.0);
        
        asi1.introducirNota(1, 5.0);
        
        System.out.println( asi1.toString() );
        System.out.println( asi2.toString() );
                
    }
    
}
