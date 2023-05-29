class U2SpyPlane extends Vehicle {
    private double wingSpan;

    public U2SpyPlane(int speed, String color, double price, double wingSpan) {
        super(speed, color, price);
        this.wingSpan = wingSpan;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wing Span: " + wingSpan);
    }

    public void fly() {
        System.out.println("U-2 Spy Plane is flying.");
    }
}