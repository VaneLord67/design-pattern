package prototype;

import javax.swing.text.DefaultEditorKit;
import java.io.*;

/**
 * @author CJR
 * @create 2021-09-23-17:01
 */
public class DeepProtoType implements Serializable,Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType() {
      super();
    }
    //使用clone方法
    @Override
    protected Object clone(){
        Object deep =null;
        try {
            //完成对基本类型和String的克隆
            deep = super.clone();
            //处理引用类型的属性
            DeepProtoType deepProtoType = (DeepProtoType) deep;
            deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deep;
    }

    //通过对象的序列化完成深拷贝
    public Object deepClone(){
        Object copy = null;
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            copy = ois.readObject();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return copy;
    }
}
