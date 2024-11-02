package newshelf2;

public class NewSelection {

    public static <T> T getAgeOrTitle(IBook<T> book) {
        return book.getTitle();
    }

    public static void main(String[] args) {
        TextBook textBook = new TextBook("Social Studies");
        Fiction fiction = new Fiction("Anthropologies", Genre.COMEDY);
        Comic comic = new Comic("He-Man", 15);

        System.out.println("TextBook title is " + getAgeOrTitle(textBook)); 
        System.out.println("Fiction genre is " + getAgeOrTitle(fiction));    
        System.out.println("Comic title is " + getAgeOrTitle(comic));       
    }
}
