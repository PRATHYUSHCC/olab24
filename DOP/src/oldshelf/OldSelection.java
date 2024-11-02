package oldshelf;

public class OldSelection {

    public static String getAgeOrTitle(Object o) {
        if (!(o instanceof Book)) {
            return "";
        }

        return switch (o) {
            case Comic comic -> comic.getTitle();
            case Fiction fiction -> fiction.getName();
            case TextBook textBook -> textBook.getSubject();
            default -> "";
        };
    }
}


