package iterator;

/**
 * @author CJR
 * @create 2021-10-06-16:30
 */
public class ComputerCollegeIterator implements Iterator{
    //这里需要知道department是以怎样的方式存放
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {

    }

}
