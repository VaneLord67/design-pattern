package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CJR
 * @create 2021-09-25-16:32
 */
public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();
    public void addHandler(Handler handler){
        this.handlers.add(handler);
    }
    public boolean process(Request request){
        for(Handler handler : handlers){
            Boolean r = handler.process(request);
            if(r != null){
                System.out.println("请求" + (r ? "通过" : "不通过"));
                return r;
            }
        }
        throw new RuntimeException("不能处理该请求");
    }
}
