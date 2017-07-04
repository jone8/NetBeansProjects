package wad.readinglist.domain;

public class Book {

    private String isbn;
    private String title;
    private String status;

    public Book() {
    }

    public Book(String isbn, String title, String status) {
        this.isbn = isbn;
        this.title = title;
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
