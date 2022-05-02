package org.example.mockito.test_doubles.dummy;


import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DummyTest {

    @Test
    public void demoDummy() {
        BookRepository bookRepository = new FakeBookRepository();
        EmailService emailService = new DummyEmailService();
        BookService bookService = new BookService(bookRepository, emailService);

        bookService.addBook(new Book("1234","Mockito In Action", 250, LocalDate.now()));
        bookService.addBook(new Book("1235","JUnit 5 In Action", 200, LocalDate.now()));

        assertEquals(2, bookService.findNumberOfBooks());
    }
}
