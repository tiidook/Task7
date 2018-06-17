package by.TaxiExpress.Model.Entity.Container;

import by.TaxiExpress.Model.Entity.CheapLineCar;
import by.TaxiExpress.Model.Entity.ComfortLineCar;

public class Autopark {
    private int countCars;
    private int countCheapCars;
    private int countComfortCars;
    private CheapLineCar cheapestCar;
    private ComfortLineCar mostExpensiveCar;
    private CheapLineCar cheapestCarForKilometer;
    private ComfortLineCar mostExpensiveCarForKilometer;

    public int getCountCars() {
        return countCars;
    }

    public void setCountCars(int countCars) {
        this.countCars = countCars;
    }

    public int getCountCheapCars() {
        return countCheapCars;
    }

    public void setCountCheapCars(int countCheapCars) {
        this.countCheapCars = countCheapCars;
    }

    public int getCountComfortCars() {
        return countComfortCars;
    }

    public void setCountComfortCars(int countComfortCars) {
        this.countComfortCars = countComfortCars;
    }

    public CheapLineCar getCheapestCar() {
        return cheapestCar;
    }

    public void setCheapestCar(CheapLineCar cheapestCar) {
        this.cheapestCar = cheapestCar;
    }

    public ComfortLineCar getMostExpensiveCar() {
        return mostExpensiveCar;
    }

    public void setMostExpensiveCar(ComfortLineCar mostExpensiveCar) {
        this.mostExpensiveCar = mostExpensiveCar;
    }

    public CheapLineCar getCheapestCarForKilometer() {
        return cheapestCarForKilometer;
    }

    public void setCheapestCarForKilometer(CheapLineCar cheapestCarForKilometer) {
        this.cheapestCarForKilometer = cheapestCarForKilometer;
    }

    public ComfortLineCar getMostExpensiveCarForKilometer() {
        return mostExpensiveCarForKilometer;
    }

    public void setMostExpensiveCarForKilometer(ComfortLineCar mostExpensiveCarForKilometer) {
        this.mostExpensiveCarForKilometer = mostExpensiveCarForKilometer;
    }
}
