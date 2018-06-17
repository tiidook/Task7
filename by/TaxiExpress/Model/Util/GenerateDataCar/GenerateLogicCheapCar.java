package by.TaxiExpress.Model.Util.GenerateDataCar;

import by.TaxiExpress.Model.Entity.CheapLineCar;
import by.TaxiExpress.Model.Util.CarUtil.UtilInterface;

import java.util.Random;

public class GenerateLogicCheapCar {

    public static final String[] NAMES = {"Peugeot", "VolksWagen", "Skoda", "Geelly", "Lada", "Lifan", "KIA"
            , "Huyndai", "Opel", "Ford"};

    public static final int MinPrice = 5000;
    public static final int MaxPrice  = 12000;
    public static final double MaxPriceForKilometer = 0.7;
    public static final double MinPriceForKilometer = 0.3;
    public static final int MaxSeats = 8;
    public static final int MinSeats = 3;

    static Random random = new Random();

    public static void generateName(CheapLineCar cheapLineCar){

        cheapLineCar.setName(NAMES[random.nextInt(NAMES.length - 1 - 0 + 1) + 0]);
    }

    public static void generatePriceForCar(CheapLineCar cheapLineCar){

        cheapLineCar.setPriceForCar(random.nextInt(MaxPrice - MinPrice + 1) + MinPrice);
    }

    public static void generatePriceForKilometer(CheapLineCar cheapLineCar){

        cheapLineCar.setPriceForKilometer(MinPriceForKilometer + (MaxPriceForKilometer - MinPriceForKilometer)
        * random.nextDouble());
    }

    public static void generateCountSeats(CheapLineCar cheapLineCar){

        cheapLineCar.setCountSeats(random.nextInt(MaxSeats - MinSeats + 1) + MinSeats);
    }

    public static void generateId(CheapLineCar cheapLineCar, UtilInterface utilInterface){
        int countCars = utilInterface.getSizeAutoParkCheap() + utilInterface.getSizeAutoParkCheap();

        for (int i = 0; i < countCars; i++){
            int a = random.nextInt(countCars + 2 - 1) + 1;

            if (!utilInterface.checkListCheapForId(a) && !utilInterface.checkListComfortForId(a)){
                cheapLineCar.setId(a);
                break;
            }
        }
    }

    public static void generateDataCar(CheapLineCar cheapLineCar, UtilInterface utilInterface){

        generateId(cheapLineCar, utilInterface);
        generateCountSeats(cheapLineCar);
        generateName(cheapLineCar);
        generatePriceForCar(cheapLineCar);
        generatePriceForKilometer(cheapLineCar);

    }
}
