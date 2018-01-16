package builder;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonBuilderTest {

    @Test
    void shouldCreateExpectedPersonUsingDirectCall() {
        final PersonBuilder underTest = new PersonBuilder();
        final Person createdPerson = underTest.withFirstName("John").withSecondName("Doe").create();

        assertAll(
                () -> assertEquals("John", createdPerson.getFirstName()),
                () -> assertEquals("Doe", createdPerson.getLastName())
        );
        // the builder (underTest) is still available here...
    }

    @Test
    void shouldCreateExpectedPersonObjectUsingFunctionalCall(){
        final Function<PersonBuilder, Person> unknownHeroCreator = builder -> builder.withFirstName("unknown").withSecondName("hero").create();
        final Person createdPerson = unknownHeroCreator.apply(new PersonBuilder());

        assertAll(
                () -> assertEquals("unknown", createdPerson.getFirstName()),
                () -> assertEquals("hero", createdPerson.getLastName())
        );
        // the builder is no longer available
    }
}