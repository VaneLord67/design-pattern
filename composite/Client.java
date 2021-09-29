package composite;

/**
 * @author CJR
 * @create 2021-09-28-13:54
 */

//组合模式Composite
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "中国顶级大专");
        OrganizationComponent college = new College("计院", "农民工培养基地");
        OrganizationComponent college2 = new College("机械院", "低级农民工培养基地");

        OrganizationComponent department = new Department("计科", "basic");
        OrganizationComponent department2 = new Department("软工", "soft");
        OrganizationComponent department3 = new Department("制图", "不会");

        college.add(department);
        college.add(department2);
        college2.add(department3);

        university.add(college);
        university.add(college2);

        university.print();

    }
}
