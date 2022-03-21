package creational.builder.clasic;

public class Address {
    protected final String street;
    protected final Long code;
    protected String description;
    protected boolean isPrimary;

    private Address(String street, Long code) {
        this.street = street;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", code=" + code +
                ", description='" + description + '\'' +
                ", isPrimary=" + isPrimary +
                '}';
    }

    public static class Builder extends Address {

        public Builder(String street, Long code) {
            super(street, code);
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder isPrimary(boolean isPrimary) {
            this.isPrimary = isPrimary;
            return this;
        }

        public Address build() {
            return this;
        }
    }
}
