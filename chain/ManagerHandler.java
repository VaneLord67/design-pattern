package chain;

import java.math.BigDecimal;

/**
 * @author CJR
 * @create 2021-09-25-16:30
 */
public class ManagerHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(1000)) > 0){
            return null;
        }
        return true;
    }
}
