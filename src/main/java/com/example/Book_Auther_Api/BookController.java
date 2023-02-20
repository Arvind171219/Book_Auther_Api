package com.example.Book_Auther_Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.AttributeOverride;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public ResponseEntity addBook(@RequestBody Book book){
        String message = bookService.addBook(book);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PostMapping("/add-auther")

    public ResponseEntity addAther(@RequestBody Auther auther){
        Auther Auther;
        Auther = null;
        String message = bookService.addAuther(Auther,auther);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @GetMapping("/getheighestnumber_ofpage_book")
    public ResponseEntity getHeighestNumberofpageBook(){
        String bookName=bookService.getHeighestNumberofpageBook();
        return new ResponseEntity<>(bookName,HttpStatus.CREATED);
    }

    @GetMapping("/update_book/_page")

    public ResponseEntity updateBookPages(@RequestParam("q") String bookName,@RequestParam("ep")String extrapages) {
        bookService.updateBookPages(bookName,extrapages);
        return new ResponseEntity<>("page updated succesfully",HttpStatus.CREATED);
    }
   @GetMapping("/get-top-rated_book")
    public ResponseEntity findTopRatedBook(@RequestParam("rating") int ratings){
        int books = bookService.findTopRatedBook(ratings);
        return new ResponseEntity<>(books,HttpStatus.CREATED);
   }

}
