package pl.coderslab.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.ISBN;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ISBN
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;
}
