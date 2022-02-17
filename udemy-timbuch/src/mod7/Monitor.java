package mod7;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    //resolution class is an example of Composition OOP Concept
    //it depicts a Has-A relationship rather than 
    //an Is-A relationship depicted by Inheritance
    //Monitor Is-Not-A Resolution but Has-A Resolution

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
