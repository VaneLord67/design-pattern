package facade;

/**
 * @author CJR
 * @create 2021-09-25-15:36
 */
public class AdminOfIndustry {
    public Company register(String name){
        int id = 1;
        return new Company(name,id);
    }
}
