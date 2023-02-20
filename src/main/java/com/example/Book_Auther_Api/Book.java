package com.example.Book_Auther_Api;

public class Book {
    private String bookName;
    private String autherName;
    private int page;

    public Book(String bookName, String autherName, int page) {
        this.bookName = bookName;
        this.autherName = autherName;
        this.page = page;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
