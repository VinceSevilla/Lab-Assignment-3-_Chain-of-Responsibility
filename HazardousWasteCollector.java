public class HazardousWasteCollector implements WasteHandler{
    private WasteHandler nextHandler;

    @Override
    public void setNextHandler(WasteHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleWaste(WasteContainer container){
        if(container.getType().equalsIgnoreCase("hazardous") && container.isFull()){
            System.out.println("Collecting and safely disposing hazardous waste (Capacity: " + container.getCapacity() + "L)");
        }else if (nextHandler != null){
            nextHandler.handleWaste(container);
        }else{
            System.out.println("No handler found for waste type: " + container.getType());
        }
    }
}