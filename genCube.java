import java.util.ArrayList;

public class genCube {
    public static ArrayList<ArrayList<ArrayList<Integer>>> cube = new ArrayList<>();

    public genCube() {
        ArrayList<ArrayList<ArrayList<Integer>>> temp = new ArrayList<>();
        for(int i = 1; i <= 6; i++) {
            temp.add((new cubeSide(i)).getSide());
        }
        cube = temp;
    }

    public static String printCube() {
        StringBuilder end = new StringBuilder();
        for(int i = 0; i < cube.size(); i++) {
            end.append("\n").append(cubeSide.printSide(cube, i));
        }
        return end.toString();
    }
}
