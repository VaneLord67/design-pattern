package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CJR
 * @create 2021-10-06-16:44
 */
public class InfoCollege implements College{

    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业","信息安全");
        addDepartment("网络安全专业","网络安全");
        addDepartment("服务器专业","服务器安全");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}
