package controller;

import model.Book;
import model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.BookService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@SessionAttributes("cart")
public class CartController {

    @Autowired
    private BookService bookService;

    @ModelAttribute("cart")
    public List<Item> cart() {
        return new ArrayList<>();
    }

    @GetMapping("/addToCart/{id}")
    public String viewAdd(Model model, @PathVariable("id") long id, @ModelAttribute("cart") List<Item> cartItems) {
        Book book = bookService.findOne(id);
        Item checkedItem = checkBookInCart(book,cartItems);
        if(checkedItem == null){
            Item item = new Item(book, 1);
            cartItems.add(item);
            model.addAttribute("cartItems", cartItems);
        }else {
            updateQuantity(book,cartItems);
            model.addAttribute("cartItems", cartItems);
        }
        return "cart";
    }

    public Item checkBookInCart(Book book, List<Item> cartItems) {
        Iterator itr = cartItems.iterator();
        while (itr.hasNext()){
            Item current = (Item) itr.next();
            if (current.getBook().getId().equals(book.getId())){
                return current;
            }
        }
        return null;
    }

    public void updateQuantity (Book book, List<Item> cartItems){
        Iterator itr = cartItems.iterator();
        while (itr.hasNext()){
            Item current = (Item) itr.next();
            if (current.getBook().getId().equals(book.getId())){
                current.setQuantity(current.getQuantity()+1);
            }

        }
    }
}
