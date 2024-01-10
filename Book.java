package bookcatalog;

import java.io.Serializable;

/**
 *
 * @author fsheridan
 */
public class Book implements Serializable {
    private String author;
    private String title;
    private String isbn;
    
    public Book(){
        author = new String();
        title = new String();
        isbn = new String();
    }

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    // I have adjusted this getDetails method (I have added \n just for better user presentation 
    
    public String getDetails(){
        return "Book:"+title+",\nAuthor:"+author+",\nISBN:"+isbn + "\n";
    }
    
}
