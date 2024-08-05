package Ex4;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public int getTotalPages() {
        return books.stream().mapToInt(Book::getPages).sum();
    }
}
