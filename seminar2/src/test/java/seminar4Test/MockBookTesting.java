package seminar4Test;

import Seminar4.Book;
import Seminar4.BookService;
import Seminar4.IBookRepository;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MockBookTesting {
    private IBookRepository mockBookRepository;
    private BookService bookService;

    @Before
    public void setUp(){
        mockBookRepository = mock(IBookRepository.class);
        bookService = new BookService(mockBookRepository,new ArrayList<Book>());
    }


    @Test
    void testingAddBook(){
        Book book = new Book(1,"Айболит");
        when(mockBookRepository.addBook(1,"Айболит")).thenReturn(book);
        bookService.addBook(book);
        /* Проверяю, что добавилась книга*/
        assertEquals(1,bookService.capacity());
        verify(mockBookRepository, times(1)).addBook(1,"Айболит");
    }
    void testingGetBook(){
        Book book1 = new Book(3,"Война и мир");
        Book book2 = new Book(6,"Руслан и Людмила");
        bookService.addBook(book1);
        bookService.addBook(book2);
        when(mockBookRepository.getBook(6)).thenReturn(book2);
        Book res = mockBookRepository.getBook(6);
        assertEquals(book2, res);
        verify(mockBookRepository, times(1)).getBook(6);
    }

}


