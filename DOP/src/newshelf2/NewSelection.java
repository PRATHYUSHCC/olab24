package newshelf2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewSelection {

    public static <T> T getAgeOrTitle(IBook<T> book) {
        return book.getTitle();
    }

    public static void main(String[] args) {
        TextBook textBook = new TextBook("Social Studies");
        Fiction fiction = new Fiction("Anthropologies", Genre.COMEDY);
        Comic comic = new Comic("He-Man", 15);
        
        // Display titles
        System.out.println("TextBook title is " + getAgeOrTitle(textBook)); 
        System.out.println("Fiction genre is " + getAgeOrTitle(fiction));    
        System.out.println("Comic title is " + getAgeOrTitle(comic));       

        // Create a list of IBook
        List<IBook<?>> books = new ArrayList<>();
        books.add(textBook);
        books.add(fiction);
        books.add(comic);

        // Sort the books based on their respective compareTo methods
        Collections.sort(books, (b1, b2) -> {
            if (b1 instanceof Comparable && b2 instanceof Comparable) {
                return ((Comparable) b1).compareTo(b2);
            }
            return 0; // Handle case where objects aren't comparable
        });

        // Display sorted titles
        System.out.println("Books sorted by title:");
        for (IBook<?> book : books) {
            System.out.println(book.getTitle());
        }
    }
}

