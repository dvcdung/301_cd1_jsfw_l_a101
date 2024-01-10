//package com.crud.demofinal.controllers;
//
//import com.crud.demofinal.services.MyBookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class MyBooksController {
//
//    @Autowired
//    private MyBookService myBookService;
//
//    @RequestMapping("/delete-book/{id}")
//    public String deleteBookFromList(@PathVariable int id) {
//        myBookService.deleteById(id);
//        return "redirect:/my-books";
//    }
//}
