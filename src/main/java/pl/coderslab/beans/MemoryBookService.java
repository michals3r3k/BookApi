package pl.coderslab.beans;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemoryBookService implements MemoryService<Book>{
    private List<Book> listOfBooks;
    private static Long nextId;


//    public MemoryBookService() {
//        listOfBooks = new ArrayList<>();
//
//        listOfBooks.add(new Book(1L, "9788324631766", "Thiniking	in	Java",
//                "Bruce	Eckel", "Helion", "programming"));
//        listOfBooks.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.",
//                "Sierra	Kathy,	Bates	Bert", "Helion", "programming"));
//        listOfBooks.add(new Book(3L, "9780130819338", "Java	2.	Podstawy",
//                "Cay	Horstmann,	Gary	Cornell", "Helion", "programming"));
//        nextId=4L;
//    }

    @Override
    public List<Book> findBooks() {
        return this.listOfBooks;
    }

    @Override
    public Book getBookById(Long id) {
        return this.listOfBooks.get(Math.toIntExact(id)-1);
    }

    @Override
    public Book editBook(Book book) {
        this.listOfBooks.set(this.listOfBooks.indexOf(this.listOfBooks.get(Math.toIntExact(book.getId())-1)), book);
        return book;
    }

    @Override
    public void deleteBook(Long id) {
        this.listOfBooks = this.listOfBooks.stream().filter(book-> !book.getId().equals(id)).collect(Collectors.toList());
    }

    @Override
    public void addBook(Book book) {
        book.setId(nextId++);
        listOfBooks.add(book);
    }

    public List<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(List<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

}
