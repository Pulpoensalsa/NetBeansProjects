/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomodelaje;



/**
 *
 * @author JuanPe
 */
public class ProyectoModelaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro cenicienta = new Libro( "La cenicienta" , "123456789", 300); 
        
        Libro pinocho = new Libro ("Pinocho Puigdemont", "87654322", 3);
        
        
        cenicienta.abrir();
        cenicienta.cerrar();
        pinocho.abrir();
        cenicienta.abrir();
        pinocho.cerrar();
        
        
        if( pinocho.estaLibroAbierto() )
            System.out.println("Cierra el libro, que le va a crecer la nariz");
        else
            System.out.println("Abre el libro, inculto!");
        
        if( cenicienta.estaLibroAbierto() )
            System.out.println("No puedo dejar de leerlo");
        else
            System.out.println("Vaya peñazo de libro, no puedo ni abrirlo");

    }
    
}
