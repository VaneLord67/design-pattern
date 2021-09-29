package prototype;

import java.io.Serializable;

/**
 * @author CJR
 * @create 2021-09-23-17:00
 */
public class DeepCloneableTarget implements Cloneable, Serializable {

    @Override
    protected Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
