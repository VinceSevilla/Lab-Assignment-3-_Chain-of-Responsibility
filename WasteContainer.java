public class WasteContainer{
    private String type;
    private int capacity;
    private boolean full;

    public WasteContainer(String type, int capacity, boolean full){
        this.type = type;
        this.capacity= capacity;
        this.full = full;
    }

    public String getType(){
        return type;
    }

    public int getCapacity(){
        return capacity;
    }

    public boolean isFull(){
        return full;
    }
}