import java.util.Iterator;
import java.util.Stack;

/**
 * 具体的命令，用来保存具体的命令的管理作业
 */
public class MacroCommand implements Command {

    private Stack commands = new Stack();

    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()){
            Command command = (Command)iterator.next();
            command.execute();
        }
    }

    public void append(Command command){
        if (command != this){
            commands.push(command);
        }
    }

    public void undo(){
        if (!commands.empty()){
            commands.pop();
        }
    }

    public void clear(){
        commands.clear();
    }
}
