package newshelf2;

public final class TextBook implements IBook<String> {
    private final String subject;

    public TextBook(String subject) {
        this.subject = subject;
    }

    @Override
    public String getTitle() {
        return subject;
    }
}
