package ie.atu.week12;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepo;

    public PersonService(PersonRepository personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person person) {
        personRepo.save(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        return personRepo.findByEmployeeId(employeeId);
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }
}
