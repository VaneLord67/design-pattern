package visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author CJR
 * @create 2021-10-06-20:59
 */
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    public void attach(Person p){
        persons.add(p);
    }

    public void detach(Person p){
        persons.remove(p);
    }

    public void display(Action action){
        for(Person p : persons){
            p.accept(action);
        }
    }
}
