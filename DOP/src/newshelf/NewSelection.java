package newshelf;

public class NewSelection {

    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case TextBook textBook -> textBook.subject();
            case Fiction fiction -> fiction.name();
            case Comic comic -> comic.title();
            case IBook book when book.isRare() -> "Rare Book";
            default -> "";
        };
    }

    public static void main(String[] args) {
        TextBook textBook = new TextBook("Social Studies");
        Fiction fiction = new Fiction("Anthropologies");
        Comic comic = new Comic("He-Man", 15);

        System.out.println("TextBook is " + getAgeOrTitle(textBook)); 
        System.out.println("Fiction book is " + getAgeOrTitle(fiction));    
        System.out.println("Comic book is " + getAgeOrTitle(comic));       
    }
}
