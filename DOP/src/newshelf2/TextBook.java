package newshelf2;

public record TextBook<T extends Comparable<T>>(T subject) implements IBook<T> {
    @Override
    public T getInfo() {
        return subject;
    }

    @Override
    public int compareTo(IBook<T> other) {
        if (other instanceof TextBook<T> otherTextBook) {
            return subject.compareTo(otherTextBook.subject);
        }
        return -1; // Can return -1 if types are different, or handle as desired
    }
}


