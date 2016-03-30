package creational.builder.java_8;


import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaPersonBuilder {

    @FunctionalInterface
    public interface PersonSetter extends Consumer<Person> {}

    public static Person build(PersonSetter... personSetters) {
        final Person person = new Person();

        Stream.of(personSetters).forEach(
                s -> s.accept(person)
        );

        return person;
    }
}
