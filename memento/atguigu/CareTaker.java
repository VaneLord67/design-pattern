package memento.atguigu;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CJR
 * @create 2021-10-06-15:27
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }

}
