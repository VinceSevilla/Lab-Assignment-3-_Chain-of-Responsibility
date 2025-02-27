public class RecyclableWasteCollector implements WasteHandler{
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleWaste(WasteContainer container){
        if(container.getType().equalsIgnoreCase("recyclable") && container.isFull()){
            System.out.println("Collecting and sending recyclable waste for processing (Capacity: " + container.getCapacity() + "L)");
        }else if (nextHandler != null){
            nextHandler.handleWaste(container);
        }
    }
}