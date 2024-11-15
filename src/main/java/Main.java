import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Navigator instance = new Navigator(new int[] {5, 5}, new String[] {"3", "3", "E"}, "MMRMMRMRRM");
        System.out.println(Arrays.toString(Navigator.navigate(instance.getGrid(), instance.getPosition(), instance.getInstruction())));
    }
}
