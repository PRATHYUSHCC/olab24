package newshelf2;

public sealed interface IBook<T> permits TextBook, Fiction, Comic {
    T getTitle();
}
