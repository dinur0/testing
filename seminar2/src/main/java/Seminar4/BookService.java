package Seminar4;

import java.util.List;

public class BookService {
    private final IBookRepository bookRepository;
    public List<Book> books;

    public BookService(IBookRepository bookRepository, List<Book> books) {
        this.bookRepository = bookRepository;
        this.books = books;
    }
    public void addBook(Book book){
        this.books.add(book);
}
    public int capacity(){
        return books.size();
}
}
