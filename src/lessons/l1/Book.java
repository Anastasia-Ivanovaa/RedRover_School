package lessons.l1;

public class Book {
    String title;
    String author;
    String language;
    int pages;

    @Override
    public String toString() {
        return title + '\'' +
               author + '\'' +
               language + ',' + pages;
    }
}
