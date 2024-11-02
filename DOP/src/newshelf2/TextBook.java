package newshelf2;

public final class TextBook implements IBook<String>, Comparable<TextBook> {
    private final String subject;

    public TextBook(String subject) {
        this.subject = subject;
    }

    @Override
    public String getTitle() {
        return subject;
    }

    @Override
    public int compareTo(TextBook other) {
        return this.subject.compareTo(other.subject);
    }
}

