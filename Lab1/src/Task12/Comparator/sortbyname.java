package Task12.Comparator;

import Task12.Book;

import java.util.Comparator;

public class sortbyname implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.GetTitle().compareTo(o2.GetTitle());
    }
}
