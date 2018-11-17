package test.workshop.useless.utility;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static org.mockito.Mockito.verify;

public class BusinessLogicTest {

    @Mock
    private Storage storage;
    private BusinessLogic businessLogic;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        businessLogic = new BusinessLogic(storage);
    }

    @Test
    public void saveUniqueThings_When_DoStuff() {
        businessLogic.doStuff("Pen", "Laptop", "Pen", "Book");
        verify(storage).save(Set.of("Pen", "Laptop", "Book"));
    }
}