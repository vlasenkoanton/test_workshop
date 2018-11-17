package test.workshop.blackbox;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.workshop.Data;

import static org.mockito.Mockito.verify;

public class BlackBoxBusinessLogicTest {
    @Mock
    private DataStorage dataStorage;
    private BlackBoxBusinessLogic businessLogic;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        businessLogic = new BlackBoxBusinessLogic(dataStorage);
    }

    @Test
    public void saveData_When_DataNameIsNotBlank() {
        Data data = new Data("name");
        businessLogic.doStuff(data);
        verify(dataStorage).save(data);
    }

    @DataProvider
    private Object[][] blankString() {
        return new Object[][]{
                {null}, {""}, {" "}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "blankString")
    public void illegalArgumentException_When_DataNameIsBlank(String name) {
        Data data = new Data(name);
        businessLogic.doStuff(data);
    }
}