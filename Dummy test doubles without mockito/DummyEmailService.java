package org.example.mockito.test_doubles.dummy;

public class DummyEmailService implements EmailService{
    @Override
    public void sendEmail(String message) {
        // by chance if this method is called then the error can be thrown
        throw new AssertionError("Method not implemented");
    }
}
