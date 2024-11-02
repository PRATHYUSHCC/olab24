package newshelf2;

public final class Fiction implements IBook<Genre>, Comparable<Fiction> {
    private final String name;
    private final Genre genre;

    public Fiction(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public Genre getTitle() {
        return genre;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Fiction other) {
        return this.name.compareTo(other.name); // Comparing by name
    }
}
