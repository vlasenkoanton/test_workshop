package test.workshop.dependencycouple.field;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FieldDependencyBusinessLogicTest {

    @Mock
    private ValidatorSettingStorage validatorSettingStorage;

    private FieldDependencyBusinessLogic businessLogic;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        businessLogic = new FieldDependencyBusinessLogic();
        Object validator = ReflectionTestUtils.getField(businessLogic, "validator");
        ReflectionTestUtils.setField(validator, "validatorSettingStorage", validatorSettingStorage);

    }

    @Test
    public void test() {
        new FieldDependencyBusinessLogic();
    }

}