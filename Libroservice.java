import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LibroService {

    @Value("${gutendex.url}")
    private String apiUrl;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public LibroService(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.objectMapper = objectMapper;
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        String url = apiUrl + "/books?search=" + titulo;
        String jsonResponse = restTemplate.getForObject(url, String.class);
        // Procesar el JSON usando ObjectMapper y retornar el primer libro encontrado
        return null;
    }

    public List<Libro> obtenerTodosLosLibros() {
        String url = apiUrl + "/books";
        String jsonResponse = restTemplate.getForObject(url, String.class);
        // Procesar el JSON usando ObjectMapper y retornar la lista de libros
        return null;
    }
}
