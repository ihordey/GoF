package creational.builder.java_8;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class LambdaPersonBuilderTest {

    @Test
    public void canConstructAPersonWithNewBuilder() {

        Person person =
                LambdaPersonBuilder.build(
                        p -> p.setId(101101101L),
                        p -> p.setName("Ed")
                );

        assertThat(person.getId(), equalTo(101101101L));
        assertThat(person.getName(), equalTo("Ed"));
    }


}