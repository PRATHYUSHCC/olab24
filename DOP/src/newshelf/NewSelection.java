package newshelf;

record TextBook(String subject) {}
record Fiction(String name) {}
record Comic(String title, int issueNumber) {}
interface IBook {}




public class NewSelection {

    public static String getAgeOrTitle(Object o) {
        return switch (o) {
            case TextBook(String subject) -> subject; // Record pattern
            case Fiction(String name) -> name;         // Record pattern
            case Comic(String title, int issueNumber) when issueNumber>=20-> title; // Record pattern
            default -> "Unknown Type";
        };
    }

    public static void main(String[] args) {
        TextBook textBook = new TextBook("Social Studies");
        Fiction fiction = new Fiction("Anthropologies");
        Comic comic = new Comic("He-Man", 15);
        Comic comic1=new Comic("adventures", 26);

        System.out.println("TextBook is " + getAgeOrTitle(textBook)); 
        System.out.println("Fiction book is " + getAgeOrTitle(fiction));    
        System.out.println("Comic book is " + getAgeOrTitle(comic));
        System.out.println("Comic book is " + getAgeOrTitle(comic1));        
          
    }
}

