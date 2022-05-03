package org.example.mockito.test_doubles.Spy;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findAll();
}
