package pl.coderslab.beans;

import pl.coderslab.model.Book;

import java.util.List;

public interface MemoryService {
    List<Book> findAll();
    Book getElementById(Long id);
    Book edit();
    void delete();
    void add(Book book);
}
