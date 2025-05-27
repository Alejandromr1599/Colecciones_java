
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class Usuario {
    private String nombre;
    private String dni;
    private List <Libro> librosPrestados;

    public Usuario(String nombre, String dni ) {
        this.nombre = nombre;
        this.dni = dni;
        this.librosPrestados = new ArrayList<>();
        
    }
    public boolean PrestarLibro(Libro libro){
        if (librosPrestados.size() < 3 && Libro.isPrestado()){
            if(Libro.prestar()){
                librosPrestados.add(libro);
                return true;
            }
        }
        return false;
    }
    
     public boolean devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            libro.devolver();
            return true;
        }
        return false;
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados por " + nombre + ":");
        for (Libro libro : librosPrestados) {
            libro.mostrarInfo();
            System.out.println();
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
