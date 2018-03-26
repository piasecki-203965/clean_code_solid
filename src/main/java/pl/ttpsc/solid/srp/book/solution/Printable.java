package pl.ttpsc.solid.srp.book.solution;

public interface Printable<T> {

    String printAllPages(T obj);

    void printPage(T obj);

}
