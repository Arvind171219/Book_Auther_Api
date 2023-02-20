package com.example.Book_Auther_Api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public String addBook(Book book){
        return bookRepository.addBook(book);
    }

    public String getHeighestNumberofpageBook() {
      return bookRepository.getHeighestNumberofpageBook();
    }

    public String addAuther(Auther auther, Auther auther1) {
        return bookRepository.addAuther(auther);

    }

    public int findTopRatedBook(int ratings) {
        return bookRepository.findTopRatedBook(ratings);
    }

    public void updateBookPages(String bookName, String extrapages) {
        bookRepository.updateBookPages(bookName, extrapages);
    }
}
