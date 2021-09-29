package chain;

import java.math.BigDecimal;

/**
 * @author CJR
 * @create 2021-09-25-16:31
 */
public class DirectorHandler implements Handler{
    @Override
    public Boolean process(Request request) {
        if(request.getAmount().compareTo(BigDecimal.valueOf(10000)) > 0){
            return null;
        }
        return true;
    }
}
