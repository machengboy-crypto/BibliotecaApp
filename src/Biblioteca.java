
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {

        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void buscarLibro(String titulo) {

        boolean encontrado = false;

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(libro);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    public void prestarLibro(String titulo) {

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                if (!libro.isPrestado()) {

                    libro.prestar();
                    System.out.println("Libro prestado correctamente.");

                } else {

                    System.out.println("El libro ya está prestado.");

                }

                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    public void devolverLibro(String titulo) {

        for (Libro libro : libros) {

            if (libro.getTitulo().equalsIgnoreCase(titulo)) {

                if (libro.isPrestado()) {

                    libro.devolver();
                    System.out.println("Libro devuelto correctamente.");

                } else {

                    System.out.println("El libro ya estaba disponible.");

                }

                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }
}