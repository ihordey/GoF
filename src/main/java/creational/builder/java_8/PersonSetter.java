package creational.builder.java_8;

import java.util.function.Consumer;

@FunctionalInterface
public interface PersonSetter extends Consumer<Person> {
}
