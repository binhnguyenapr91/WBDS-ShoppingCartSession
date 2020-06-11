package controller;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.BookService;

@Controller
public class ProductController {
    @Autowired
    BookService bookService;

    @GetMapping("/")
    ModelAndView showListing(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("listing");
        Page<Book> books = bookService.findAll(pageable);
        modelAndView.addObject("books",books);
        return modelAndView;
    }
}
