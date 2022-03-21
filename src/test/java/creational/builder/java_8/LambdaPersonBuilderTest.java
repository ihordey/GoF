package creational.builder.java_8;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LambdaPersonBuilderTest {

    @Test
    void buildPerson() {
        final long id = 101L;
        final String name = "Ivan";
        final Person person = LambdaPersonBuilder.build(p -> p.setId(id), p -> p.setName(name));

        assertThat(person)
                .isNotNull()
                .isEqualTo(new Person(id, name));
    }
}