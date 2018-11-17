package test.workshop.useless.initialization;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    /* Tip: If you can't construct adequate phrase for the test name, most likely that you are trying to write useless test  */

    @Test
    public void testFieldInitialized() {
        Person person = new Person("Anton", 29);
        assertEquals(person.getName(), "Anton");
        assertEquals(person.getAge(), 29);
    }

    @Test
    public void testGetterSetter() {
        Person person = new Person();
        person.setName("Ivan");
        person.setAge(25);
        assertEquals(person.getName(), "Ivan");
        assertEquals(person.getAge(), 25);
    }
}