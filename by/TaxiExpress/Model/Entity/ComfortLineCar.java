package by.TaxiExpress.Model.Entity;

public class ComfortLineCar extends Car {

    private double priceForMinuteCollapse;


    public ComfortLineCar(){

    }

    public ComfortLineCar(int id, String name, int priceForCar, double priceForKilometer,
                          int countSeats, double priceForMinuteCollapse){

        super (id,name,priceForCar,priceForKilometer);
        this.priceForMinuteCollapse = priceForMinuteCollapse;

    }

    public double getPriceForMinuteCollapse() {
        return priceForMinuteCollapse;
    }

    public void setPriceForMinuteCollapse(double priceForMinuteCollapse) {
        this.priceForMinuteCollapse = priceForMinuteCollapse;
    }

    @Override
    public String toString(){
        return  "\t id: " + super.getId() + "\t Name: " + super.getName()  + "\t Price: "
                + super.getPriceForCar() + "\t For 1 km: "
                + super.getPriceForKilometer() + "\t" + "\t Collapse: "
                + "\t" + priceForMinuteCollapse + "\t  " + "\n";
    }
}
