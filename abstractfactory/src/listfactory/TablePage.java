package listfactory;

import factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author){
        super(title, author);
    }
    @Override
    public String makeHTML() {
        return null;
    }
}
