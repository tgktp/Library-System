package com.example.LIBRARY.service;


import com.example.LIBRARY.model.Book;
import com.example.LIBRARY.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServices {

@Autowired
private BookRepository employeeRepository;//new ledik,kopyaladık//interfaceden kopyaladık

public Book addBook(Book book){//işe alma
return BookRepository.save(book);
}

public List<Book> getAllBook(){
return BookRepository.findAll();
}

public Optional<Book> getBookById(Long barcode){
  //optional özel bir özelliğe göre sıralama için kullanırız
return BookRepository.findById(barcode);
 }

public Book updateBook(Long barcode,Book bookDetails) {
Book book = BookRepository.findById(barcode)
        .orElseThrow(() -> new RuntimeException("KİTAP BULUNAMADI"));
book.setBarcode(bookDetails.getBarcode());
book.setBookName(bookDetails.getBookName());
return BookRepository.save(book);
}

public void deleteBook(Long barcode) {
Book book =BookRepository.findById(barcode).orElseThrow(() -> new RuntimeException("ÇALIŞAN BULUNAMADI"));
            BookRepository.delete(barcode);
}

}
