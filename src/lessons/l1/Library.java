package lessons.l1;

public class Library {

    Book[] books;

    static Book createBook(String title, String author, String language) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        book.language = language;
        return book;
    }

    public void printBookCard(){
        for (Book book : books) {
            System.out.println(indexCardHeader);
            System.out.println(book.toString());

        }
    }

    static String indexCardHeader = "======BOOK=====";
}



