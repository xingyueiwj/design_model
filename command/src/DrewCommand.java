import java.awt.*;

/**
 * 具体的命令，指定画笔类型和具体的画画实现
 */
public class DrewCommand implements Command {

    protected Drawable drawable;

    private Point position;

    public DrewCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
