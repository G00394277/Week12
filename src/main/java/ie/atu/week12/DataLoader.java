package ie.atu.week12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository) { this.personRepository = personRepository; }

    @Override
    public void run (String... args) throws Exception {
        Person testData = new Person(1L, "Paul", 23, "paul@atu.ie", "Mr", "12345", "Lecturer", "Electronics");
        Person testData2 = new Person(2L, "Joe", 43, "joe@atu.ie", "Mr", "12346", "Lecturer", "Electronics");
        Person testData3 = new Person(3L, "Tina", 33, "tina@atu.ie", "Ms", "12347", "Lecturer", "Electronics");
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
