package Seminar4;

public interface IBookRepository {
    Book addBook(int id, String name);
    Book getBook(int id);
}
