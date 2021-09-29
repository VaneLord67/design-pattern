package composite;

/**
 * @author CJR
 * @create 2021-09-28-13:54
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
