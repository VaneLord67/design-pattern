package builder.improve;

/**
 * @author CJR
 * @create 2021-09-23-18:48
 */

//抽象建造者
public abstract class HouseBuilder {
    protected House house = new House();
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();
    public House buildHouse(){
        return house;
    }
}
