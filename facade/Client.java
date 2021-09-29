package facade;

/**
 * @author CJR
 * @create 2021-09-25-15:35
 */
public class Client {
    public static void main(String[] args){
        Company company = new Facade().openCompany("hello,world");
    }
}
