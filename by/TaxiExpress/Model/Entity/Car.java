package by.TaxiExpress.Model.Entity;

public class Car {
    private int id;
    private String name;
    private int priceForCar;
    private double priceForKilometer;


    public Car(){

    }

    public Car(int id, String name, int priceForCar, double priceForKilometer){
        this.id = id;
        this.name = name;
        this.priceForCar = priceForCar;
        this.priceForKilometer = priceForKilometer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceForCar() {
        return priceForCar;
    }

    public void setPriceForCar(int priceForCar) {
        this.priceForCar = priceForCar;
    }

    public double getPriceForKilometer() {
        return priceForKilometer;
    }

    public void setPriceForKilometer(double priceForKilometer) {
        this.priceForKilometer = priceForKilometer;
    }
}
