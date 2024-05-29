import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        cubeAction action = new cubeAction();
        ArrayList<ArrayList<ArrayList<Integer>>> cube = genCube.cube;
        System.out.println(genCube.printCube());
        action.moveR(false, 0);
    }
}