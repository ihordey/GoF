package creational.builder.clasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void testAddress() {
        Address address = new Address.Builder("kaidasheva", 101012L)
                .description("my description")
                .isPrimary(true)
                .build();
        System.out.println(address);
    }
}