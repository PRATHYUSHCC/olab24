package newshelf2;

public record Fiction<T extends Comparable<T>>(T title) implements IBook<T> {
    @Override
    public T getInfo() {
        return title;
    }

    @Override
    public int compareTo(IBook<T> other) {
        if (other instanceof Fiction<T> otherFiction) {
            return title.compareTo(otherFiction.title);
        }
        return -1;
    }
}
