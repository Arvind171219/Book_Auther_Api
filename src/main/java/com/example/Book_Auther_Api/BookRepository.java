package com.example.Book_Auther_Api;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {

    HashMap<String ,Book> book_db = new HashMap<>();
    HashMap<String ,Auther> auther_db = new HashMap<>();

    public String addBook(Book book){
        if(book_db.containsKey(book.getBookName())){
            return "Book is already present";
        }
        book_db.put(book.getBookName(),book);
        return "Book Added successfuly";
    }


    public String getHeighestNumberofpageBook() {
        String bookName="";
        int maxPages=0;
        for(Book book :book_db.values()){
            if(book.getPage()>maxPages){
                maxPages=book.getPage();
                bookName=book.getBookName();
            }
        }
        return bookName;
    }


    public int findTopRatedBook(int ratings) {
        int topartedBook=0;
        for(Book book : book_db.values()){
            String autherName = book.getAutherName();
            if(auther_db.get(autherName).getRating()>ratings){
                topartedBook++;
            }
        }
        return topartedBook;
    }

    public void updateBookPages(String bookName, String extrapages) {

        int old_page = book_db.get(bookName).getPage();
        book_db.get(bookName).setPage(Integer.parseInt(old_page+extrapages));

    }

    public String addAuther(Auther auther) {
        if(auther_db.containsKey(auther.getName())){
            return "Auther is already present";
        }
        auther_db.put(auther.getName(),auther);
        return "Auther Added successfully";
    }
}
