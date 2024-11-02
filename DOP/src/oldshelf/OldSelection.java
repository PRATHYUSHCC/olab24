package oldshelf;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OldSelection {

    @Test
    void testGetAgeOrTitle_WithComic() {
        // Positive Test Case: Comic
        Comic comic = new Comic("Dylan:The Great Adventures", 12);
        String result = OldSelection.getAgeOrTitle(comic);
        assertEquals("Dylan:The Great Adventures", result, "Should return comic title");
    }

    @Test
    void testGetAgeOrTitle_WithFiction() {
        // Positive Test Case: Fiction
        Fiction fiction = new Fiction("Pulp Fiction", FictionType.Comedy);
        String result = OldSelection.getAgeOrTitle(fiction);
        assertEquals("Pulp Fiction", result, "Should return fiction name");
    }

    @Test
    void testGetAgeOrTitle_WithTextBook() {
        // Positive Test Case: TextBook
        TextBook textbook = new TextBook("Social Studies");
        String result = OldSelection.getAgeOrTitle(textbook);
        assertEquals("Social Studies", result, "Should return textbook subject");
    }

    @Test
    void testGetAgeOrTitle_WithNonBookObject() {
        // Negative Test Case: Non-Book object
        String nonBookObject = "Non-book object";
        String result = OldSelection.getAgeOrTitle(nonBookObject);
        assertEquals("", result, "Should return empty string for non-Book object");
    }
}

