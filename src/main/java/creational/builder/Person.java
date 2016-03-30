package creational.builder;

import java.util.Date;

public class Person {
    // required fields:
    private String name;
    private int age;

    // optional fields:
    private Date birthday;
    private String email;
    private String phone;
    private String address;
    private float weight;
    private float height;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.birthday = builder.birthday;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.weight = builder.weight;
        this.height = builder.height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }


    public static class Builder {
        private String name;
        private int age;

        // optional fields:
        private Date birthday;
        private String email;
        private String phone;
        private String address;
        private float weight;
        private float height;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        //can be static factory
        public static Builder of(String name, int age) {
            return new Builder(name, age);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder birthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder weight(float weight) {
            this.weight = weight;
            return this;
        }

        public Builder height(float height) {
            this.height = height;
            return this;
        }

        public Person build() {
            // can validate filds
            /*if (name == null) {
                throw new IllegalArgumentException("Name cannot be null");
            }*/
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("inner class : "+new Person.Builder("Nam", 31)
                .email("nam@gmail.com")
                .address("Hanoi")
                .build());

        //use static factory
        System.out.println("static factory : "+Builder.of("Nam", 31)
                .email("nam@gmail.com")
                .address("Hanoi")
                .build());

    }
}