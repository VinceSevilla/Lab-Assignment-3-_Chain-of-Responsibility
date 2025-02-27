public interface WasteHandler {
    void setNextHandler(WasteHandler setNextHandler);
    void handleWaste(WasteContainer container);
}