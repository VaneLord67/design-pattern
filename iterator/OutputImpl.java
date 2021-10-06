package iterator;

import java.util.List;

/**
 * @author CJR
 * @create 2021-10-06-16:46
 */
public class OutputImpl {
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        java.util.Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()){
            College college = iterator.next();
            System.out.println("=======" + college.getName() + "=========");
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department d = (Department)iterator.next();
            System.out.println(d.getName());
        }
    }

}
