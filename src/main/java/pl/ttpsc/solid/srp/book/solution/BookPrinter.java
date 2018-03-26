package pl.ttpsc.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter implements Printable<Book> {

    @Override
    public String printAllPages(Book obj) {
        String allPages = new String();
        for (Map.Entry<Integer, String> page : obj.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return allPages;
    }

    @Override
    public void printPage(Book obj) {
        System.out.println(obj.getCurrentPageContents());
    }
}
