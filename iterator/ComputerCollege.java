package iterator;

/**
 * @author CJR
 * @create 2021-10-06-16:37
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0; //保存当前数组的对象个数

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("Java专业","java");
        addDepartment("php专业","php");
        addDepartment("大数据专业","大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
