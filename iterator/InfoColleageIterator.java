package iterator;

import java.util.List;

/**
 * @author CJR
 * @create 2021-10-06-16:33
 */
public class InfoColleageIterator implements Iterator{

    //以List存放
    List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        } else {
            index ++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
