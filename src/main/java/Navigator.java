import static java.lang.Integer.parseInt;

public class Navigator {
    private static int[] grid;
    private static String[] position;
    private static String instruction;

    public Navigator(int[] grid, String[] position, String instruction) {
        Navigator.grid = grid;
        Navigator.position = position;
        Navigator.instruction = instruction;
    }

    public static String[] navigate() {
        int gridX = grid[0];
        int gridY = grid[1];
        String facing = position[position.length - 1];
        String newFacing = facing;
        int changeInXAxis = parseInt(position[0]);
        int changeInYAxis = parseInt(position[1]);


        for(int i = 0; i < instruction.length(); i++) {
            if(changeInXAxis > gridX || changeInYAxis > gridY) throw new IllegalArgumentException("Rover Out Of Bounds!");
            if(instruction.charAt(i) == 'L' && newFacing.equals("N")) newFacing = "W";
            if(instruction.charAt(i) == 'L' && newFacing.equals("S")) newFacing = "E";
            if(instruction.charAt(i) == 'L' && newFacing.equals("E")) newFacing = "N";
            if(instruction.charAt(i) == 'L' && newFacing.equals("W")) newFacing = "S";
            if(instruction.charAt(i) == 'R' && facing.equals("N")) newFacing = "E";
            if(instruction.charAt(i) == 'R' && facing.equals("S")) newFacing = "W";
            if(instruction.charAt(i) == 'R' && facing.equals("E")) newFacing = "S";
            if(instruction.charAt(i) == 'R' && facing.equals("W")) newFacing = "N";
            if(instruction.charAt(i) == 'M' && newFacing.equals("N")) {
                changeInYAxis++;
                if(changeInYAxis > gridY) throw new IllegalArgumentException("Rover Out Of Bounds");
            }
            if(instruction.charAt(i) == 'M' && newFacing.equals("S")) {
                changeInYAxis--;
                if(changeInYAxis < 0) throw new IllegalArgumentException("Rover Out Of Bounds");
            }
            if(instruction.charAt(i) == 'M' && newFacing.equals("E")) {
                changeInXAxis++;
                if(changeInXAxis > gridX) throw new IllegalArgumentException("Rover Out Of Bounds");
            }
            if(instruction.charAt(i) == 'M' && newFacing.equals("W")) {
                changeInXAxis--;
                if(changeInXAxis < 0) throw new IllegalArgumentException("Rover Out Of Bounds");
            }
        }
        return new String[] {String.valueOf(changeInXAxis), String.valueOf(changeInYAxis), newFacing};
    }


}
