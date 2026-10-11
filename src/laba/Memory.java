package laba;

public class Memory {

    private int capacity;
    private String type;

    public Memory(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return capacity + " ГБ, " + type;
    }
}
