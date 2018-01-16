package builder;

import static java.lang.String.format;

public class Person {
    private final String firstName;
    private final String lastName;

    Person(final String surname, final String name) {
        this.firstName = surname;
        this.lastName = name;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return format("[Person: first name: %s, second name: %s]", firstName, lastName);
    }
}
