import java.awt.*;

/**
 * 具体的画画，初始化画板和管理命令的集合，每次画的时候从集合中去命令来画
 */
public class DrawCanvas extends Canvas implements Drawable {

    private Color color = Color.red;
    private int radius = 6;
    private MacroCommand history;

    public DrawCanvas(int width, int height, MacroCommand history){
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    public void paint(Graphics g){
        history.execute();
    }

    public void draw(int x, int y){
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x-radius, y-radius,radius*2,radius*2);
    }
}
