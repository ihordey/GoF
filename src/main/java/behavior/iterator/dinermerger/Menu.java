package behavior.iterator.dinermerger;

@FunctionalInterface
public interface Menu<T> {
    Iterator<T> createIterator();

    default Iterator<T> createReverseIterator() {
        throw new UnsupportedOperationException("It doesn't implemented");
    }
}
