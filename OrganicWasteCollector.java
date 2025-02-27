public class OrganicWasteCollector implements WasteHandler{
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleWaste(WasteContainer container){
        if(container.getType().equalsIgnoreCase("organic") && container.isFull()){
            System.out.println("Collecting and composting organic waste (Capacity: " + container.getCapacity() + "L)");
        }else if (nextHandler != null){
            nextHandler.handleWaste(container);
        }
    }
}