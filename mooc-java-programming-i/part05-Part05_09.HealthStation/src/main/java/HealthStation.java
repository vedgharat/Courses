public class HealthStation {

    private int weighings; // needed for PART 3, initially 0 by default

    public int weigh(Person person) {
        this.weighings++; // increment weighing count
        return person.getWeight();
    }

    public void feed(Person person) {
        // Increase the weight by 1
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        // return how many weighings have been done
        return this.weighings;
    }
}
