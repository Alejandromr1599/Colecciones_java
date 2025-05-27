
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class Biblioteca {
      private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibrosDisponibles() {
        for (Libro libro : libros) {
            if (!Libro.isPrestado()) {
                libro.mostrarInfo();
                System.out.println();
            }
        }
    }

    public void mostrarTodosLosLibros() {
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println();
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.getNombre());
            usuario.mostrarLibrosPrestados();
            System.out.println();
        }
    }

    public Usuario buscarUsuarioPorNombre(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null;
    }
}
