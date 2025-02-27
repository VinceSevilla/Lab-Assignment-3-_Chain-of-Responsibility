public class WasteManagementSystem{
    public WasteHandler chain;

    public WasteManagementSystem(){
        this.chain = new OrganicWasteCollector();
        WasteHandler recyclableHandler = new RecyclableWasteCollector();
        WasteHandler hazardousHandler = new HazardousWasteCollector();

        chain.setNextHandler(recyclableHandler);
        recyclableHandler.setNextHandler(hazardousHandler);
    }

    public void processWaste(WasteContainer container){
        chain.handleWaste(container);
    }

    public static void main(String[] args){
        WasteManagementSystem system = new WasteManagementSystem();

        WasteContainer OrganicBin = new WasteContainer("organic", 10, true);
        WasteContainer recycleBin = new WasteContainer("recyclable", 20, true);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 30, true);
        WasteContainer unknownBin = new WasteContainer("electronics", 40, true);

        system.processWaste(OrganicBin);
        system.processWaste(recycleBin);
        system.processWaste(hazardousBin);
        system.processWaste(unknownBin);
    }
}