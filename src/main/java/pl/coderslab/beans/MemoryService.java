package pl.coderslab.beans;

import pl.coderslab.model.Book;
import java.util.List;

public interface MemoryService <T>{
    List<T> findAll();
    T getElementById(Long id);
    T edit(T t);
    void delete(Long id);
    void add(T t);
}
