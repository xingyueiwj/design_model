package listfactory;

import factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption){
        super(caption);
    }
    @Override
    public String makeHTML() {
        return null;
    }
}
