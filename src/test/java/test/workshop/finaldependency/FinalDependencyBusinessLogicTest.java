package test.workshop.finaldependency;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.workshop.Data;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class FinalDependencyBusinessLogicTest {

    @Mock
    private DataValidator dataValidator;
    @Mock
    private DataStorage dataStorage;
    private FinalDependencyBusinessLogic businessLogic;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        businessLogic = new FinalDependencyBusinessLogic(dataValidator, dataStorage);
    }

    @Test
    public void error_When_DataIsNotValid() {
        Data data = new Data();
        when(dataValidator.isValid(data)).thenReturn(false);
        assertEquals(businessLogic.doStuff(data), "ERROR");
    }

    @Test
    public void saveData_When_DataIsValid() {
        Data data = new Data();
        when(dataValidator.isValid(data)).thenReturn(true);
        when(dataStorage.save(data)).thenReturn("status");
        assertEquals(businessLogic.doStuff(data), "status");
    }

}