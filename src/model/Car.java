package model;

public class Car {
    public  int id=0;

    private String brand;
    private String model;
    private String engine;
    private String bodyType;
    private int seats;
    private int doors;
    private String speed;
    private String rentAmount;

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Car(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(String brand, String model, String engine, String bodyType, int seats, int doors, String speed, String rentAmount) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rentAmount = rentAmount;

    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(String rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id="+id+
                ",brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                ", speed='" + speed + '\'' +
                ", rentAmount='" + rentAmount + '\'' +
                '}';
    }
}
