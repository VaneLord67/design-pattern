package builder;

/**
 * @author CJR
 * @create 2021-09-23-18:30
 */
public class CommonHouse extends AbstractHouse{
    @Override
    void buildBasic() {
        System.out.println("commonHouse buildBasic");
    }

    @Override
    void buildWall() {
        System.out.println("commonHouse buildWall");
    }

    @Override
    void roofed() {
        System.out.println("commonHouse roofed");
    }
}
