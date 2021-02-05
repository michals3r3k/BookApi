package pl.coderslab.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.beans.MemoryService;
import pl.coderslab.model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MemoryService memoryService;

    @Autowired
    public BookController(MemoryService bookService) {
        this.memoryService = bookService;
    }

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("")
    public List<Book> showAllBooks(){
        return memoryService.findAll();
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        memoryService.add(book);
    }

    @GetMapping("/{id}")
    public Book showBookById(@PathVariable Long id){
        return (Book) memoryService.getElementById(id);
    }

    @PutMapping("")
    public Book editBook(@RequestBody Book book){
        return (Book) memoryService.edit(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        memoryService.delete(id);
    }

}
