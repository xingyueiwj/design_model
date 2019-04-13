import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class Main {
    public static void main(String [] args){
        Factory factory = Factory.getFactory("listfactory.ListFactory");

        Link people = factory.createLink("aa","11");
        Link gmw = factory.createLink("aa","11");
        Link yahoo = factory.createLink("aa","11");
        Link yahoo1 = factory.createLink("aa","11");
        Link excite = factory.createLink("aa","11");
        Link google = factory.createLink("aa","11");

        Tray tray = factory.createTray("bb");
        tray.add(people);
        tray.add(gmw);

        Tray tray1 = factory.createTray("cc");
        tray1.add(yahoo);
        tray1.add(yahoo1);

        Tray tray2 = factory.createTray("dd");
        tray2.add(excite);
        tray2.add(google);

        Page page = factory.createPage("LinkPage", "xxx");
        page.add(tray);
        page.add(tray2);
        page.output();
    }
}
