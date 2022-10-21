package Task12.Comparator;

import Task12.Book;

import java.util.Comparator;

public class sortbyauthornameprice implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        var authorCompare = o1.GetAuthor().compareTo(o2.GetAuthor());
        return authorCompare != 0 ? authorCompare : o1.GetTitle().compareTo(o2.GetTitle());
    }
}
