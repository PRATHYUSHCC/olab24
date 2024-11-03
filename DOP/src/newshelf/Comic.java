package newshelf;


public record Comic(String title, int ageOfMainCharacter) implements IBook {
    
    public String getTitle() {
        return title;
    }
}
