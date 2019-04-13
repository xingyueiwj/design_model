package factory;

/**
 * 抽象的零件
 */
public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }
    public abstract String makeHTML();
}
