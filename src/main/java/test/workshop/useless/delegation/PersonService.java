package test.workshop.useless.delegation;

import test.workshop.useless.initialization.Person;

public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public void save(Person person) {
        personRepository.save(person);
    }
}
