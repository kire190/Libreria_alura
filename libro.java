import javax.persistence.*;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String idioma;
    private int descargas;

    @ManyToOne(fetch = FetchType.LAZY)
    private Autor autor;

    // getters y setters
}


