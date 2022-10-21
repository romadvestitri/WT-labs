package Task12.Comparator;

import Task12.Book;

import java.util.Comparator;

public class sortbynameauthor implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var titleCompare = o1.GetTitle().compareTo(o2.GetTitle());
        return titleCompare != 0 ? titleCompare : o1.GetAuthor().compareTo(o2.GetAuthor());
    }
}
