package facade;

/**
 * @author CJR
 * @create 2021-09-25-15:37
 */
public class Bank {
    public void openAccount(Company company){
        company.setAccount(company.getId().toString());
    }
}
