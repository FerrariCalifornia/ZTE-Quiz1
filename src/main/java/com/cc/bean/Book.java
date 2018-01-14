package com.cc.bean;

public class Book {
    private String id;
    private String type;
    private String bookName;
    private Double pirce;


    public Book() {
    }

    public Book(String type, String bookName, Double pirce) {
        this.type = type;
        this.bookName = bookName;
        this.pirce = pirce;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPirce() {
        return pirce;
    }

    public void setPirce(Double pirce) {
        this.pirce = pirce;
    }
}
