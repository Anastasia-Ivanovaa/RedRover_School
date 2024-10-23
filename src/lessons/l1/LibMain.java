package lessons.l1;

public class LibMain {

    public static void main(String[] args) {

        Book onegin = new Book();
        onegin.author = "Пушкин А.С.";
        onegin.title = "Евгений Онегин";
        onegin.language = "Руский";
        onegin.pages = 200;

        Book ivanhoe = new Book();
        ivanhoe.author = "W. Scott";
        ivanhoe.title = "Ivanhoe";
        ivanhoe.language = "English";
        ivanhoe.pages = 250;

        Book gore = Library.createBook("Горе от ума", "Грибоедов А. С.", "Русский");

        Library libraryOfCongress = new Library();
        libraryOfCongress.books = new Book[]{onegin, ivanhoe, gore};
        libraryOfCongress.printBookCard();

    }

}
