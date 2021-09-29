package chain;

import java.math.BigDecimal;

/**
 * @author CJR
 * @create 2021-09-25-16:28
 */
public class Request {
    private String name;
    private BigDecimal amount;
    public Request(String name,BigDecimal amount){
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
