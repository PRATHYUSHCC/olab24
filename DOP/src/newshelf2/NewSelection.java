package newshelf2;


public class NewSelection {
    public static String getAgeOrTitle(IBook<?> book) {
        return switch (book) {
            case TextBook<?> textBook -> textBook.getInfo().toString();
            case Fiction<?> fiction -> fiction.getInfo().toString();
            case Comic<?> comic -> comic.getInfo().toString();
            default -> "Unknown Type";
        };
    }

    public static void main(String[] args) {
        TextBook<String> textBook1 = new TextBook<>("Mathematics");
        TextBook<String> textBook2 = new TextBook<>("Science");
        Fiction<String> fiction1 = new Fiction<>("Harry Potter");
        Fiction<String> fiction2 = new Fiction<>("Lord of the Rings");
        Comic<String> comic1 = new Comic<>("Marvel: Issue 15");
        Comic<String> comic2 = new Comic<>("DC: Issue 10");

        System.out.println("Comparing textbooks: " + textBook1.compareTo(textBook2));
        System.out.println("Comparing fiction books: " + fiction1.compareTo(fiction2));
        System.out.println("Comparing comics: " + comic1.compareTo(comic2));
    }
}

