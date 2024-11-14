import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class InputParser {
//    ArrayList<Integer> plateauLayout =  new ArrayList<>();
//    ArrayList<String> initialPosition = new ArrayList<>();

    String input;

    public static void parseInput(String input) {
        String[] position;
        String[] strArr = input.split("");
        String lastCharInString = strArr[strArr.length -1];
        List<String> numberArr = Arrays.asList(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"});
        if(numberArr.contains(lastCharInString)) {
            setPlateauSize(strArr[0], lastCharInString);
            //return new String[] {strArr[0], lastCharInString};

        } else if(lastCharInString.equals("N") || lastCharInString.equals("S") || lastCharInString.equals("E") || lastCharInString.equals("W")) {
            position = strArr;
            setPosition(position[0], position[2], position[4]);

            //return new String[]{position[0], position[2], position[4]};
        } else if(Arrays.asList(strArr).contains("L") || Arrays.asList(strArr).contains("R") || Arrays.asList(strArr).contains("M")) {
            setNavigation(strArr);

            //return strArr;
        }

        //return strArr;
    }

    private static void setNavigation(String[] inputStringArr) {
        Navigator.setInstruction(inputStringArr);
    }

    private static void setPosition(String s, String s1, String s2) {
    }

    private static void setPlateauSize(String s, String lastCharInString) {
    }
}
