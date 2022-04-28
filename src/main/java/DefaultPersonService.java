public class DefaultPersonService {

    public Person getPerson(String name) {
        return new Person(name);
    }
}