package org.example.mockito.test_doubles.Spy;

import java.util.Collection;

public class BookRepositorySpy implements BookRepository {

    int saveCalled = 0;
    Book lasTAddedBook = null;
    @Override
    public void save(Book book) {
        saveCalled++;
        lasTAddedBook = book;
    }

    public int timesCalled(){
        return saveCalled;
    }

    public boolean calledWith(Book book) {
        return lasTAddedBook.equals(book);
    }
    @Override
    public Collection<Book> findAll() {
        return null;
    }
}
