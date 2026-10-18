package coffeetype;

public abstract class Coffee {
    protected String name;
    protected int brewingTime;

    public Coffee(String name, int brewingTime) {
        this.name = name;
        this.brewingTime = brewingTime;
    }
    public abstract void playSound();

    public String getName() {
        return name;
    }

    public int getBrewingTime() {
        return brewingTime;
    }
}
