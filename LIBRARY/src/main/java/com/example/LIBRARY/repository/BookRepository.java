package com.example.LIBRARY.repository;

import com.example.LIBRARY.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Long>{

}
