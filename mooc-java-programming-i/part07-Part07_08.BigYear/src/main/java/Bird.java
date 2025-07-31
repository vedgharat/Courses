public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public void observe() {
        this.observations++;
    }

    @Override
    public String toString() {
        return name + " (" + latinName + "): " + observations + " observations";
    }
}
