import java.util.ArrayList;

public class cubeSide {
    private static ArrayList<ArrayList<Integer>> side;

    //White = 1, Red = 2, Orange = 3, Yellow = 4, Green = 5, Blue = 6
    public cubeSide(int color) {
        ArrayList<ArrayList<Integer>> tempSide = new ArrayList<>();
        ArrayList<Integer> tempRow = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            tempRow.add(color);
        }
        for (int i = 0; i < 3; i++) {
            tempSide.add(tempRow);
        }
        side = tempSide;
    }

    public cubeSide(ArrayList<ArrayList<Integer>> setSide) {
        side = setSide;
    }

    public cubeSide() {

    }

    public ArrayList<ArrayList<Integer>> getSide() {
        return side;
    }

    public static String printSide(ArrayList<ArrayList<ArrayList<Integer>>> cube, int sideNum) {
        StringBuilder end = new StringBuilder();
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                end.append(cube.get(sideNum).get(i).get(j));
            }
            end.append("\n");
        }
        return end.toString();
    }

    public ArrayList<Integer> getRow(int row) {
        return side.get(row);
    }

    public ArrayList<Integer> getCol(int col) {
        ArrayList<Integer> tempCol = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            tempCol.add(side.get(col).get(i));
        }
        return tempCol;
    }

    public void setRow(int row, ArrayList<Integer> newRow) {
        for(int i = 0; i < side.size(); i++) {
            side.get(i).set(row, newRow.get(i));
        }
    }

    /*public void setCol(int col, ArrayList<ArrayList<Integer>> newCol) {
        for(int i = 0; i < side.size(); i++) {
            side
        }
    }*/

    public int getUnder(int i) {
        return -1;
    }
}