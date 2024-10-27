
// TODO: Complete this with record components
public record TextBook(String title, String author, int publicationYear, String isbn) {
    @Override
    public String toString() {
        return String.format("Title='%s', author='%s', year=%d, ISBN='%s'",title, author, publicationYear, isbn);
    }

    public String gettit() {
        return title;
    }
    public String getAuth() {
        return author;
    }
    public int getYear() {
        return publicationYear;
    }
    public String getISBN() {
        return isbn;
    }

}
