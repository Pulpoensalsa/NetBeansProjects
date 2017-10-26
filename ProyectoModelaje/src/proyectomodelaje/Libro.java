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
public class Libro 
{
    private String titulo;
    private String ISBN;
    private boolean abierto;
    private int numeroPaginas;
    private int paginaActual;
    
    
    public Libro( String tit, String iesebeene, int numeroPaginas)
    {
        this.titulo = tit;
        this.ISBN = iesebeene;
        this.numeroPaginas = numeroPaginas;
        
        abierto = false;
        this.paginaActual = 0;
    }
    
    public void abrir()
    {
        this.setAbierto(true);
    }
    
    public void cerrar()
    {
        this.setAbierto(false);
    }
    
    public boolean estaLibroAbierto()
    {
        return isAbierto();
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the abierto
     */
    public boolean isAbierto() {
        return abierto;
    }

    /**
     * @param abierto the abierto to set
     */
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    /**
     * @return the numeroPaginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * @param numeroPaginas the numeroPaginas to set
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * @return the paginaActual
     */
    public int getPaginaActual() {
        return paginaActual;
    }

    /**
     * @param paginaActual the paginaActual to set
     */
    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }
    
    
}
