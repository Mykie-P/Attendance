class FandangoYacht extends Vehicle {
    private String mainSailColor;

    public FandangoYacht(int speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Main Sail Color: " + mainSailColor);
    }

    public void floatBoat() {
        System.out.println("Fandango Yacht is floating.");
    }
}