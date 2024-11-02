package newshelf2;

public final class Comic implements IBook<String>, Comparable<Comic> {
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

    public int getIssueNumber() {
        return issueNumber;
    }

    @Override
    public int compareTo(Comic other) {
        return this.title.compareTo(other.title); // Comparing by title
    }
}
