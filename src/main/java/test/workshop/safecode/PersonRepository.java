package test.workshop.safecode;

public class PersonRepository {
    public Person findById(Integer personId) {
        if (personId == null) throw new NullPointerException();
        return null;
    }

    public void save(Person person) {
        if (person == null) throw new NullPointerException();
    }
}
