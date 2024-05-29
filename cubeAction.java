import java.util.ArrayList;

public class cubeAction extends genCube {
    ArrayList<ArrayList<ArrayList<Integer>>> cube = genCube.cube;
    cubeSide a = new cubeSide();
    
    public void moveR(boolean prime, int side) {
        if(!prime) {
            System.out.println(cube.get(side));
        }
    }

    public void moveL(boolean prime, int side) {

    }

    public void moveU(boolean prime, int side) {

    }

    public void moveD(boolean prime, int side) {

    }

    public void moveF(boolean prime, int side) {

    }

    public void moveB(boolean prime, int side) {

    }
}
