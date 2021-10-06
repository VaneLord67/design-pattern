package iterator;

/**
 * @author CJR
 * @create 2021-10-06-16:36
 */
public interface College {
    public String getName();
    public void addDepartment(String name,String desc);
    public Iterator createIterator();
}
