package by.TaxiExpress.Model.Entity;

public class CheapLineCar extends Car{

    private int countSeats;


    public CheapLineCar(){

    }

    public CheapLineCar(int id, String name, int priceForCar, double priceForKilometer, int countSeats ){
        super (id,name,priceForCar,priceForKilometer);

        this.countSeats = countSeats;
    }

    public int getCountSeats() {
        return countSeats;
    }

    public void setCountSeats(int countSeats) {
        this.countSeats = countSeats;
    }

    @Override
    public String toString(){
        return "\t id: " + super.getId() + "\t Name: " + super.getName() + "\t Pice: "
                + super.getPriceForCar() + "\t For 1 km: "  + "\t" + super.getPriceForKilometer()
                + "\t Seats: " + countSeats + "\t "
                 + "\n";
    }



}
