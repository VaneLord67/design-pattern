package facade;
/**
 * @author CJR
 * @create 2021-09-25-15:39
 */
public class Facade {
    AdminOfIndustry admin = new AdminOfIndustry();
    Bank bank = new Bank();
    Taxation taxation = new Taxation();
    public Company openCompany(String name){
        Company company = this.admin.register(name);
        bank.openAccount(company);
        taxation.applyTaxCode(company);
        return company;
    }
}
