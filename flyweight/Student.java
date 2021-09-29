package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CJR
 * @create 2021-09-25-15:58
 */
public class Student {
    private final int id;
    private final String name;
    private static final Map<String,Student> cache = new HashMap<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Student create(int id,String name){
        String key = id + "\n" + name;
        //先查找缓存
        Student std = cache.get(key);
        if(std == null){
            System.out.println("创建新的Student");
            std = new Student(id,name);
            cache.put(key,std);
        } else {
            System.out.println("返回缓存中的实例");
        }
        return std;
    }

}
