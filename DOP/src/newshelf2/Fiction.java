package newshelf2;

public final class Fiction implements IBook<Genre> {
    private final String name;
    private final Genre genre;

    public Fiction(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    @Override
    public Genre getTitle() {
        return genre; // This might not be a good choice for title comparison, adjust as necessary.
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(IBook<Genre> other) {
        return this.getName().compareTo(((Fiction) other).getName()); // Compare based on name
    }
}

