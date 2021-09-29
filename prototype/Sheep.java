package prototype;

/**
 * @author CJR
 * @create 2021-09-23-16:35
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    @Override
    protected Sheep clone(){
        Object sheep = null;
        try {
            sheep = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Sheep)sheep;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
