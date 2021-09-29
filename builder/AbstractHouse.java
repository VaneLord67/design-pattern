package builder;

/**
 * @author CJR
 * @create 2021-09-23-17:18
 */
public abstract class AbstractHouse {
    abstract void buildBasic();
    abstract void buildWall();
    abstract void roofed();
    public void build(){
        buildBasic();
        buildWall();
        roofed();
    }
}
