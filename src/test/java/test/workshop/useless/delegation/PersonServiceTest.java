package test.workshop.useless.delegation;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.workshop.useless.initialization.Person;

import static org.mockito.Mockito.verify;

public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    private PersonService personService;

    @BeforeMethod
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        personService = new PersonService(personRepository);
    }

    @Test
    public void savePerson() {
        Person person = new Person();
        personService.save(person);
        verify(personRepository).save(person);
    }

}