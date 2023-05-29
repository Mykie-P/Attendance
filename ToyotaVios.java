class ToyotaVios extends Vehicle {
    private String tireType;

    public ToyotaVios(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tire Type: " + tireType);
    }

    public void drive() {
        System.out.println("Toyota Vios is being driven.");
    }
}