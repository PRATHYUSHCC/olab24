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
    public static void main(String[] args) {
        TextBook t = new TextBook("Science");
        System.out.println("Subject of the Tb: " + getAgeOrTitle(t)); 
        
        Comic c = new Comic(" Great Adventures", 16);
        System.out.println("comic title: " + getAgeOrTitle(c));
        
        Fiction f = new Fiction("Pulp Fiction", FictionType.Comedy);
        System.out.println("fictionname: " + getAgeOrTitle(f));
    }
}


