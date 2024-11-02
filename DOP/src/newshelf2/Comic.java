package newshelf2;

public final class Comic implements IBook<String> {
    private final String title;
    private final int issueNumber;

    public Comic(String title, int issueNumber) {
        this.title = title;
        this.issueNumber = issueNumber;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(IBook<String> other) {
        return this.getTitle().compareTo(other.getTitle());
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}

