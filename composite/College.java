package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CJR
 * @create 2021-09-28-13:54
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();


    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent){
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }

    public String getName(){
        return super.getName();
    }

    public String getDes(){
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println("--------------------" + getName() + "--------------------");
        for(OrganizationComponent organizationComponent : organizationComponents){
            organizationComponent.print();
        }
    }
}
