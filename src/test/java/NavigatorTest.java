import org.junit.jupiter.api.DisplayName;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class NavigatorTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Added test for navigating mars rover within plateau boundaries")
    void navigate() {
        // Arrange
        Navigator instanceOne = new Navigator(new int[] {5, 5}, new String[] {"1", "2", "N"}, "LLLLM");
        Navigator instanceTwo = new Navigator(new int[] {5, 5}, new String[] {"1", "6", "N"}, "LLLLM");
        // Act
        String[] resultOne = Navigator.navigate(instanceOne.getGrid(), instanceOne.getPosition(), instanceOne.getInstruction());
        String[] resultTwo = Navigator.navigate(instanceTwo.getGrid(), instanceTwo.getPosition(), instanceTwo.getInstruction());
        // Assert
        assertEquals(Arrays.toString(new String[]{"1", "3", "N"}), Arrays.toString(resultOne));
        assertEquals(Arrays.toString(new String[]{"Rover Out Of Bounds!"}), Arrays.toString(resultTwo));
    }
}