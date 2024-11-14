import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class InputParser {
//    ArrayList<Integer> plateauLayout =  new ArrayList<>();
//    ArrayList<String> initialPosition = new ArrayList<>();

    String input;

    public static String[] parseInput(String input) {
        String[] strArr = input.split("");
        List<String> numberArr = Arrays.asList(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
        if(numberArr.contains(strArr[strArr.length - 1])) {
            return new String[] {strArr[0], strArr[strArr.length - 1]};

        }

        //if((strArr[strArr.length] - 1) == Direction.N )

        return strArr;
    }
}
