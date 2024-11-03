package newshelf2;

public record Comic<T extends Comparable<T>>(T info) implements IBook<T> {
    @Override
    public T getInfo() {
        return info;
    }

    @Override
    public int compareTo(IBook<T> other) {
        if (other instanceof Comic<T> otherComic) {
            return info.compareTo(otherComic.info);
        }
        return -1;
    }
}
