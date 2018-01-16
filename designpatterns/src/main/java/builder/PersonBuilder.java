package builder;

class PersonBuilder {

    private String firstName;
    private String lastName;

    PersonBuilder withFirstName(final String name) {
        this.firstName = name;
        return this;
    }

    PersonBuilder withSecondName(final String name) {
        this.lastName = name;
        return this;
    }

    Person create() {
        return new Person(firstName, lastName);
    }
}
