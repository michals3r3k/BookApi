package pl.coderslab.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.beans.MemoryBookService;
import pl.coderslab.beans.MemoryService;
import pl.coderslab.model.Book;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MemoryService memoryBookService;

    @RequestMapping("/helloBook")
    public Book helloBook(){
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @Autowired
    public BookController(MemoryService bookService) {
        this.memoryBookService = bookService;
    }

    @GetMapping("")
    public List<Book> showAllBooks(){
        return memoryBookService.findAll();
    }


    @GetMapping("/{id}")
    public Book showBookById(@PathVariable Long id){
        return memoryBookService.getElementById(id);
    }




}
