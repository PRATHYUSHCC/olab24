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
        return genre;
    }

    public String getName() {
        return name;
    }
}

// You’ll need an enum for Genre
enum Genre {
    COMEDY, DRAMA, SCIENCE_FICTION, FANTASY
}
