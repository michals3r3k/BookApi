package pl.coderslab.beans;

import java.util.List;

public interface MemoryService <T>{
    List<T> findBooks();
    T getBookById(Long id);
    T editBook(T t);
    void deleteBook(Long id);
    void addBook(T t);
}
