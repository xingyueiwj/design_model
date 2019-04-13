import java.util.ArrayList;
import java.util.List;

public class Memento {

    int money;
    ArrayList fruits;

    public int getMoney(){
        return money;
    }

    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    //获取复制的当前数组对象
    List getFruits(){
        return (List)fruits.clone();
    }
}
