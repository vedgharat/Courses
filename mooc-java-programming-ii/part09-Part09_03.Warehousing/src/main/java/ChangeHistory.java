
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


public class ChangeHistory {

    private ArrayList<Double> historyList;

    public ChangeHistory() {

        this.historyList = new ArrayList<>();

    }

    public void add(double status) {

        historyList.add(status);

    }

    public void clear() {

        historyList.clear();

    }

    public double maxValue() {

        if (historyList.isEmpty()) {
            return 0.0;
        }

        return Collections.max(historyList);

    }

    public double minValue() {

        if (historyList.isEmpty()) {
            return 0.0;
        }

        return  1.0 * Collections.min(historyList);

    }

    public double average() {
        int sum = 0;

        if (historyList.isEmpty()) {
            return sum;
        }

        for (double e : historyList) {
            sum += e;

        }

        return 1.0 * sum / historyList.size();
    }

    @Override
    public String toString() {

        return historyList.toString();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.historyList);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChangeHistory other = (ChangeHistory) obj;
        if (!Objects.equals(this.historyList, other.historyList)) {
            return false;
        }
        return true;
    }

}