public class Cat extends Animal implements NoiseCapable {

    private String name;

    public Cat(String name) {
        super(name);
    }

    public Cat() {

        super("Cat");

        // i used this.name fist for a long time
    }

    public void purr() {

        System.out.println(super.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();

    }}