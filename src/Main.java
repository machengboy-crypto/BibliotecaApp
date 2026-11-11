
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Añadir libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

            case 1:

                System.out.print("Título: ");
                String titulo = sc.nextLine();

                System.out.print("Autor: ");
                String autor = sc.nextLine();

                biblioteca.agregarLibro(new Libro(titulo, autor));

                System.out.println("Libro añadido.");

                break;

            case 2:

                biblioteca.mostrarLibros();

                break;

            case 3:

                System.out.print("Introduce el título: ");
                String tituloBuscar = sc.nextLine();

                biblioteca.buscarLibro(tituloBuscar);

                break;

            case 4:

                System.out.print("Introduce el título: ");
                String tituloPrestar = sc.nextLine();

                biblioteca.prestarLibro(tituloPrestar);

                break;

            case 5:

                System.out.print("Introduce el título: ");
                String tituloDevolver = sc.nextLine();

                biblioteca.devolverLibro(tituloDevolver);

                break;

            case 6:

                System.out.println("Hasta pronto.");

                break;

            default:

                System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}