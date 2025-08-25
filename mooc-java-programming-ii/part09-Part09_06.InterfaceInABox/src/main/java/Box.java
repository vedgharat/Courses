
import java.util.ArrayList;


public class Box implements Packable {

    private double maxCapcity;
    private ArrayList<Packable> itemsInBox;

    public Box(double maxCapcity) {
        this.maxCapcity = maxCapcity;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable itemToPack) {
        if (this.weight() + itemToPack.weight() <= maxCapcity) {

            itemsInBox.add(itemToPack);

        }

    }

    @Override
    public double weight() {
        double sum = 0;

        for (Packable e : itemsInBox) {
            sum += e.weight();

        }

        return (double) sum;
    }

    @Override
    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }

    
    
}