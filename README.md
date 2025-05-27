# 📚 Sistema de Gestión de Biblioteca en Java

Este proyecto es una aplicación de consola en Java que permite gestionar una biblioteca, sus libros y usuarios. Incluye funcionalidades como registrar usuarios, añadir libros, prestar y devolver libros, y mostrar información relevante.

## 🧾 Descripción

La aplicación permite:

- Registrar nuevos usuarios en la biblioteca.
- Agregar libros a la colección.
- Prestar libros a usuarios (máximo 3 libros por usuario).
- Devolver libros previamente prestados.
- Consultar los libros prestados por cada usuario.
- Ver la lista de libros disponibles.
- Mostrar todos los libros registrados.
- Mostrar todos los usuarios registrados.

Todo esto se realiza a través de un menú interactivo en la consola.

## 📦 Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

### 1. `Libro`
Representa un libro con título, autor, ISBN y estado de préstamo.
- Métodos principales: `prestar()`, `devolver()`, `mostrarInfo()`.

### 2. `Usuario`
Representa a una persona que puede pedir libros prestados (máximo 3).
- Métodos principales: `prestarLibro()`, `devolverLibro()`, `mostrarLibrosPrestados()`.

### 3. `Biblioteca`
Representa la biblioteca y su gestión de usuarios y libros.
- Métodos principales: `agregarLibro()`, `registrarUsuario()`, `buscarLibro()`, `mostrarLibrosDisponibles()`.

### 4. `Main`
Clase con el menú principal que permite al usuario interactuar con el sistema desde la consola.

## 🛠️ Tecnologías Utilizadas

- Java (JDK 8+)
- Colecciones (`ArrayList`)
- Entrada por consola con `Scanner`

## 🚀 Cómo Ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/Alejandromr1599/gestion-biblioteca-java.git

2. Abre el proyecto en tu IDE Java favorito (IntelliJ, Eclipse, NetBeans, etc.).

3. Ejecuta la clase Main.java.
