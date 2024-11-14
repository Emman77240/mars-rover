import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "5 5";//\n" +
                //"1 2 N\n" +
                //"LMLMMLLMMMR";

        System.out.println(Arrays.toString(InputParser.parseInput(input)));
    }
}
