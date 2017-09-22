package behavior.strategy.validation;

public enum ValidationStrategyEnum {
    IS_ALL_LOWERCASE("Is all lower", s -> s.matches("[a-z]+")),
    IS_NUMERIC("Is numeric", s -> s.matches("\\d+"));

    private String info;
    private ValidationStrategy<String> validationStrategy;

    ValidationStrategyEnum(String info, ValidationStrategy<String> validationStrategy) {
        this.info = info;
        this.validationStrategy = validationStrategy;
    }

    public ValidationStrategy strategy() {
        return validationStrategy;
    }

    public String info() {
        return info;
    }
}
