package newshelf;

record TextBook(String subject) {}
record Fiction(String name) {}
record Comic(String title, int issueNumber) {}
interface IBook {
    boolean isRare();
}

// Implement a class for IBook
class RareBook implements IBook {
    @Override
    public boolean isRare() {
        return true; // Example logic for rarity
    }
}


public class NewSelection {

    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case TextBook(String subject) -> subject; // Record pattern
            case Fiction(String name) -> name;         // Record pattern
            case Comic(String title, int issueNumber) -> title; // Record pattern
            case IBook book when book.isRare() -> "Rare Book";
            default -> "Unknown Type";
        };
    }

    public static void main(String[] args) {
        TextBook textBook = new TextBook("Social Studies");
        Fiction fiction = new Fiction("Anthropologies");
        Comic comic = new Comic("He-Man", 15);
        RareBook rareBook = new RareBook(); // Example of a rare book

        System.out.println("TextBook is " + getAgeOrTitle(textBook)); 
        System.out.println("Fiction book is " + getAgeOrTitle(fiction));    
        System.out.println("Comic book is " + getAgeOrTitle(comic));       
        System.out.println("Rare book is " + getAgeOrTitle(rareBook));       
    }
}

