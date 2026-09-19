package Class_problems;

abstract class Thetalkingtoybox {
    private static int counter = 1001;
    private final String toyId;
    protected String name;

    public Thetalkingtoybox(String name) {
        this.name = name;
        this.toyId = "TOY-" + counter++;
    }

    public abstract String makeSound();

    public String getToyId() {
        return this.toyId;
    }
}

class ToyCar extends Thetalkingtoybox {
    public ToyCar(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return this.name + ": Vroom vroom!";
    }
}

class ToyRobot extends Thetalkingtoybox {
    public ToyRobot(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return this.name + ": Beep boop!";
    }
}
