package pl.coderslab.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Book;

import java.util.List;

@Service
@Primary
public class JpaBookService implements MemoryService<Book> {
    BookRepository bookRepository;

    public JpaBookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findById(id).isPresent() ? bookRepository.findById(id).get() : new Book();
    }

    @Override
    public Book editBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.delete(bookRepository.findById(id).get());
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }
}
