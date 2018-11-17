package test.workshop.safecode;

public class BusinessLogic {

    private PersonRepository personRepository;
    private WorkRepository workRepository;

    public BusinessLogic(PersonRepository personRepository, WorkRepository workRepository) {
        this.personRepository = personRepository;
        this.workRepository = workRepository;
    }


    public void save(Work work) {
        if (work != null) {
            Person person = getPerson(work.getPersonId());
            if (person != null) {
                workRepository.save(work);
            }
        }
    }

    private Person getPerson(Integer personId) {
        if (personId == null) throw new IllegalArgumentException();
        return personRepository.findById(personId);
    }
}
