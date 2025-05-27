
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class main {
      public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Mi Biblioteca");
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Añadir libro");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar libros prestados por usuario");
            System.out.println("6. Mostrar libros disponibles");
            System.out.println("7. Mostrar todos los libros");
            System.out.println("8. Mostrar todos los usuarios");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    biblioteca.registrarUsuario(new Usuario(nombre, dni));
                }

                case 2 -> {
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                }

                case 3 -> {
                    System.out.print("Nombre del usuario: ");
                    String nombre = sc.nextLine();
                    Usuario usuario = biblioteca.buscarUsuarioPorNombre(nombre);
                    String titulo;
                    if (usuario != null) {
                        System.out.print("Título del libro: ");
                        titulo = sc.nextLine();
                        Libro libro = biblioteca.buscarLibro(titulo);
                        if (libro != null) {
                            if (usuario.PrestarLibro(libro)) {
                                System.out.println("Libro prestado con éxito.");
                            } else {
                                System.out.println("No se pudo prestar el libro.");
                            }
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                }

                case 4 -> {
                    System.out.print("Nombre del usuario: ");
                    String nombre = sc.nextLine();
                    Usuario usuario = biblioteca.buscarUsuarioPorNombre(nombre);
                    String titulo;
                    if (usuario != null) {
                        System.out.print("Título del libro a devolver: ");
                        titulo = sc.nextLine();
                        Libro libro = biblioteca.buscarLibro(titulo);
                        if (libro != null) {
                            if (usuario.devolverLibro(libro)) {
                                System.out.println("Libro devuelto con éxito.");
                            } else {
                                System.out.println("Ese libro no lo tiene el usuario.");
                            }
                        } else {
                            System.out.println("Libro no encontrado.");
                        }
                    }
                }

                case 5 -> {
                    System.out.print("Nombre del usuario: ");
                    String nombre = sc.nextLine();
                    Usuario usuario = biblioteca.buscarUsuarioPorNombre(nombre);
                    if (usuario != null) {
                        usuario.mostrarLibrosPrestados();
                    } else {
                        System.out.println("Usuario no encontrado.");
                    }
                }

                case 6 -> biblioteca.mostrarLibrosDisponibles();

                case 7 -> biblioteca.mostrarTodosLosLibros();

                case 8 -> biblioteca.mostrarUsuarios();

                case 0 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
