package pl.coderslab.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.beans.MemoryService;
import pl.coderslab.model.Book;

import javax.persistence.EntityManager;
import javax.validation.Valid;
import java.util.List;

@Controller
public class MainController {
    MemoryService memoryService;

    public MainController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @GetMapping("/all")
    public String showBooks(Model model) {
        List<Book> books = memoryService.findBooks();
        model.addAttribute("books", books);
        return "book/show-all";
    }

    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable Long id, Model model){
        Book book = (Book) memoryService.getBookById(id);
        model.addAttribute("book", book);
        return "/book/edit-book";
    }

    @PostMapping("/edit")
    public String editBookPost(@Valid Book book, BindingResult result){
        if(result.hasErrors()){
            return "book/edit-book";
        }
        else {
            memoryService.editBook(book);
        }
        return "redirect:/all";
    }

    @GetMapping("/add")
    public String addBook(Model model){
        model.addAttribute("book", new Book());
        return "/book/add-book";
    }

    @PostMapping("/add")
    public String addBookPost(@Valid Book book, BindingResult result){
        if(result.hasErrors()){
            return "book/add-book";
        }else {
            memoryService.addBook(book);
        }
        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        memoryService.deleteBook(id);
        return "redirect:/all";
    }

    @GetMapping("/confirm/{id}")
    public String confirmDelete(@PathVariable Long id, Model model){
        Book book = (Book) memoryService.getBookById(id);
        model.addAttribute("book", book);
        return "book/confirm-delete";
    }
}
