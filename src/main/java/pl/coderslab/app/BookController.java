package pl.coderslab.app;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.beans.MemoryService;
import pl.coderslab.model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MemoryService memoryService;

    public BookController(MemoryService bookService) {
        this.memoryService = bookService;
    }


    @GetMapping("")
    public List<Book> showAllBooks(){
        return memoryService.findBooks();
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        memoryService.addBook(book);
    }

    @GetMapping("/{id}")
    public Book showBookById(@PathVariable Long id){
        return (Book) memoryService.getBookById(id);
    }

    @PutMapping("")
    public Book editBook(@RequestBody Book book){
        return (Book) memoryService.editBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        memoryService.deleteBook(id);
    }

}
