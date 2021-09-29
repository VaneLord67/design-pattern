package facade;

/**
 * @author CJR
 * @create 2021-09-25-15:36
 */
public class Company {
    private String name;
    private String account;
    private Integer id;
    private String taxCode;

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}
