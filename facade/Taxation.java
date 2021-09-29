package facade;

/**
 * @author CJR
 * @create 2021-09-25-15:38
 */
public class Taxation {
    public void applyTaxCode(Company company){
        company.setTaxCode(company.getId().toString());
    }
}
