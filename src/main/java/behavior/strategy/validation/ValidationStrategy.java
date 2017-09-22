package behavior.strategy.validation;

public interface ValidationStrategy<T> {
    boolean execute(T in);
}