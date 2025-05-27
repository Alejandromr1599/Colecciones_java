/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private static boolean prestado;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public static boolean isPrestado() {
        return prestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   
    public static boolean prestar (){
        if(!prestado){
            prestado = true;
            return true;
        }
        
        return false;
          
        }
    
    public void devolver(){
        prestado = false;
    }
    public void mostrarInfo(){
        System.out.println("El libro es " +titulo);
        System.out.println("Autor: " +autor);
        System.out.println("isbn: " +isbn);
        System.out.println("Prestamo " +prestado);
    }
    
    
}


