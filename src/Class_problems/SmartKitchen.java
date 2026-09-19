package Class_problems;

interface Washable {
    String clean();
}

abstract class SmartKitchen {
    private int speedLevel;

    public abstract String prepare();

    public int getSpeedLevel() {
        return this.speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        if (speedLevel >= 1 && speedLevel <= 5) {
            this.speedLevel = speedLevel;
        }
    }
}

class Blender extends SmartKitchen implements Washable {
    public Blender() {
        super();
    }

    @Override
    public String prepare() {
        return "Blending at speed " + getSpeedLevel();
    }

    @Override
    public String clean() {
        return "Blender rinsed and dried";
    }
}

