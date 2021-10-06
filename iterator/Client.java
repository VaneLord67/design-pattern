package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CJR
 * @create 2021-10-06-16:21
 */
public class Client {
    public static void main(String[] args) {
        List<College> collegeList = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
