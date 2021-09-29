package builder.improve;

/**
 * @author CJR
 * @create 2021-09-24-11:08
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constuctHouse();

    }
}
