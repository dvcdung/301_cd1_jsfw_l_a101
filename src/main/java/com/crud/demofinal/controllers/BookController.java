//package com.crud.demofinal.controllers;
//
//import com.crud.demofinal.models.Book;
//import com.crud.demofinal.models.MyBooks;
//import com.crud.demofinal.services.BookService;
//import com.crud.demofinal.services.MyBookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@Controller
//public class BookController {
//
//    @Autowired
//    private BookService bookService;
//
//    @Autowired
//    private MyBookService myBookService;
//
//    @GetMapping("/")
//    public String home() {
//        return "home";
//    }
//
//    @GetMapping("/list-book")
//    public ModelAndView getAllBooks() {
//        List<Book> list = bookService.getAllBooks();
//        ModelAndView m = new ModelAndView();
//        m.setViewName("bookList");
//        m.addObject("books", list);
//        return m;
//    }
//
//    @GetMapping("/new-book")
//    public String insertBook() {
//        return "bookNew";
//    }
//
//    @GetMapping("/my-books")
//    public String getMyBooks(Model model) {
//        List<MyBooks> list = myBookService.getAllMyBooks();
//        model.addAttribute("books", list);
//        return "myBooks";
//    }
//
//    @PostMapping("/save-book")
//    public String addBook(@ModelAttribute Book book) {
//        bookService.save(book);
//        return "redirect:/list-book";
//    }
//
//    @RequestMapping("/my-books/{id}")
//    public String addBookToMyBooks(@PathVariable int id) {
//        Book b = bookService.getBookById(id);
//        MyBooks mb = new MyBooks(b.getId(), b.getName(), b.getAuthor(), b.getPrice());
//        myBookService.saveMyBook(mb);
//        return "redirect:/my-books";
//    }
//
//    @RequestMapping("/update-book/{id}")
//    public String updateBook(@PathVariable int id, Model model) {
//        Book b = bookService.getBookById(id);
//        model.addAttribute("book", b);
//        return "bookEdit";
//    }
//
//    @RequestMapping("/delete/{id}")
//    public String deleteBook(@PathVariable int id) {
//        bookService.deleteBookById(id);
//        return "redirect:/list-book";
//    }
//}
