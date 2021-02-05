package pl.coderslab.beans;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryBookService implements MemoryService{
    private List<Book> listOfBooks;
    private Long nextId;


    public MemoryBookService() {
        listOfBooks = new ArrayList<>();

        listOfBooks.add(new Book(1L, "9788324631766", "Thiniking	in	Java",
                "Bruce	Eckel", "Helion", "programming"));
        listOfBooks.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.",
                "Sierra	Kathy,	Bates	Bert", "Helion", "programming"));
        listOfBooks.add(new Book(3L, "9780130819338", "Java	2.	Podstawy",
                "Cay	Horstmann,	Gary	Cornell", "Helion", "programming"));
        nextId=4L;
    }

    @Override
    public List<Book> findAll() {
        return this.listOfBooks;
    }

    @Override
    public Book getElementById(Long id) {
        return this.listOfBooks.get(Math.toIntExact(id)-1);
    }

    @Override
    public Book edit() {
        return null;
    }

    @Override
    public void delete() {
    }

    @Override
    public void add(Book book) {
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public Long getNextId() {
        return nextId;
    }

    public void setNextId(Long nextId) {
        this.nextId = nextId;
    }
}
