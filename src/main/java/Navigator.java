import static java.lang.Integer.parseInt;

public class Navigator {
    private int[] grid;
    private String[] position;
    private String instruction;

    public Navigator(int[] grid, String[] position, String instruction) {
        this.grid = grid;
        this.position = position;
        this.instruction = instruction;
    }

    public int[] getGrid() {
        return grid;
    }

    public String[] getPosition() {
        return position;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setGrid(int[] grid) {
        this.grid = grid;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public static String[] navigate(int[] grid, String[] position, String instruction) {
        int gridX = grid[0];
        int gridY = grid[1];
        String facing = position[position.length - 1];
        int changeInXAxis = parseInt(position[0]);
        int changeInYAxis = parseInt(position[1]);


        for(int i = 0; i < instruction.length(); i++) {
            if(changeInXAxis > gridX || changeInYAxis > gridY) return new String[] {"Rover Out Of Bounds!"};
            else if(instruction.charAt(i) == 'L' && facing.equals("N")) facing = "W";
            else if(instruction.charAt(i) == 'L' && facing.equals("S")) facing = "E";
            else if(instruction.charAt(i) == 'L' && facing.equals("E")) facing = "N";
            else if(instruction.charAt(i) == 'L' && facing.equals("W")) facing = "S";
            else if(instruction.charAt(i) == 'R' && facing.equals("N")) facing = "E";
            else if(instruction.charAt(i) == 'R' && facing.equals("S")) facing = "W";
            else if(instruction.charAt(i) == 'R' && facing.equals("E")) facing = "S";
            else if(instruction.charAt(i) == 'R' && facing.equals("W")) facing = "N";
            else if(instruction.charAt(i) == 'M' && facing.equals("N")) {
                changeInYAxis++;
                if(changeInYAxis > gridY) return new String[] {"Rover Out Of Bounds!"};
            } else if(instruction.charAt(i) == 'M' && facing.equals("S")) {
                changeInYAxis--;
                if(changeInYAxis < 0) return new String[] {"Rover Out Of Bounds!"};
            } else if(instruction.charAt(i) == 'M' && facing.equals("E")) {
                changeInXAxis++;
                if(changeInXAxis > gridX) return new String[] {"Rover Out Of Bounds!"};
            } else if(instruction.charAt(i) == 'M' && facing.equals("W")) {
                changeInXAxis--;
                if(changeInXAxis < 0) throw new IllegalArgumentException("Rover Out Of Bounds");
            } else {
                return new String[] {"Invalid Input"};
            }
        }
        return new String[] {String.valueOf(changeInXAxis), String.valueOf(changeInYAxis), facing};
    }


}
