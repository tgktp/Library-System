package com.example.LIBRARY.controller;

import com.example.LIBRARY.model.Book;
import com.example.LIBRARY.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController //Bu anotasyon,bu sınıfın bir control sınıfı/RESTful web servisi oldugunu belirtir
@RequestMapping("/api/book")
public class BookController {


@Autowired
private BookServices bookServices;

@PostMapping
public Book addBook(@RequestBody Book book){
return BookServices.addBook(book);
 }

 @GetMapping
 public List<Book> getAllBook(){
 return BookServices.getAllBook();
  }

 @GetMapping
 public Optional<Book> getBookById(@PathVariable Long barcode){
 return BookServices.getBookById(barcode);
  }

 @PutMapping
 public Book updateBook(@PathVariable Long id,@RequestBody Book bookDetails) {
 return BookServices.updateBook(id, bookDetails);
 }

 @DeleteMapping
 public void deleteBook(@PathVariable Long barcode) {
     BookServices.deleteBook(barcode);
  }

 }
