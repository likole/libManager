package org.libM.entity;

public class book {

    private int bookId;

    private String bookIsbn;

    private int bookNumber;

    private int bookBorrow;//借出多少本

    private String bookImage;

    private String bookTitle;

    private String bookIntro;

    private String bookAuthor;

    private String bookAuthorIntro;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public int getBookBorrow() {
        return bookBorrow;
    }

    public void setBookBorrow(int bookBorrow) {
        this.bookBorrow = bookBorrow;
    }

    public String getBookImage() {
        return bookImage;
    }

    public void setBookImage(String bookImage) {
        this.bookImage = bookImage;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookIntro() {
        return bookIntro;
    }

    public void setBookIntro(String bookIntro) {
        this.bookIntro = bookIntro;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthorIntro() { return bookAuthorIntro; }

    public void setBookAuthorIntro(String bookAuthorIntro) { this.bookAuthorIntro = bookAuthorIntro; }

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", bookIsbn='" + bookIsbn + '\'' +
                ", bookNumber=" + bookNumber +
                ", bookBorrow=" + bookBorrow +
                ", bookImage='" + bookImage + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", bookIntro='" + bookIntro + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookAuthorIntro='" + bookAuthorIntro + '\'' +
                '}';
    }
}
