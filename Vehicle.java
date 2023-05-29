class Vehicle {
    public int speed;
    public String color;
    public double price;

    public Vehicle(int speed, String color, double price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }

    public void displayInfo() {
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}