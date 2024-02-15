package BehaviouralDesignPattern.NullObjectPattern;

public class Car implements Vehicle{
    private int seatingCapacity;
    private int tankCapacity;

    public Car(int seatingCapacity, int tankCapacity) {
        this.seatingCapacity = seatingCapacity;
        this.tankCapacity = tankCapacity;
    }
    @Override
    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public int getTankCapacity() {
        return tankCapacity;
    }
}
