import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}

import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Main implements CommandLineRunner {

    private final LibroService libroService;
    private final Scanner scanner;

    public Main(LibroService libroService) {
        this.libroService = libroService;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(String... args) throws Exception {
        mostrarMenu();
    }

    private void mostrarMenu() {
        int opcion;
        do {
            System.out.println("=== LiterAlura - Catálogo de Libros ===");
            System.out.println("1. Buscar libro por título");
            System.out.println("2. Listar todos los libros");
            System.out.println("3. Listar autores");
            System.out.println("4. Listar autores vivos en un año específico");
            System.out.println("5. Estadísticas: Cantidad de libros por idioma");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarTodosLosLibros();
                    break;
                case 3:
                    listarAutores();
                    break;
                case 4:
                    listarAutoresVivosEnAnio();
                    break;
                case 5:
                    estadisticasLibrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);
    }

    private void buscarLibroPorTitulo() {
        System.out.print("Ingrese el título del libro a buscar: ");
        String titulo = scanner.nextLine();
        // Llamar al servicio para buscar el libro por título
    }

    private void listarTodosLosLibros() {
        // Llamar al servicio para obtener todos los libros y mostrarlos
    }

    private void listarAutores() {
        // Implementar la lógica para listar todos los autores
    }

    private void listarAutoresVivosEnAnio() {
        // Implementar la lógica para listar autores vivos en un año específico
    }

    private void estadisticasLibrosPorIdioma() {
        // Implementar la lógica para mostrar estadísticas de libros por idioma
    }
}
