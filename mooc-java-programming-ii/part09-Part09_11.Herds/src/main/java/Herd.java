
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {

        herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {

        for (Movable movObj : herdList) {

            movObj.move(dx, dy);
        }

    }

    @Override
    public String toString() {
        String newString = "";

        for (Movable mov : herdList) {

            newString += mov.toString().trim() + "\n";
        }

        return newString;

    }

}