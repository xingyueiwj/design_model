package listfactory;

import factory.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url){
        super(caption,url);
    }
    @Override
    public String makeHTML() {
        return null;
    }
}
