package by.TaxiExpress.Model.Util.GenerateDataCar;

import by.TaxiExpress.Model.Entity.ComfortLineCar;
import by.TaxiExpress.Model.Util.CarUtil.UtilInterface;

import java.util.Random;

public class GenerateLogicComfortCar {

    public static final String[] NAMES = {"Audi", "BMW", "Porsche", "Lexus", "Bentley", "Mercedes", "Hummer"
            , "Pontiac", "Dodge", "GMC"};

    public static final int MinPrice = 20000;
    public static final int MaxPrice  = 30000;
    public static final double MaxPriceForKilometer = 2.5;
    public static final double MinPriceForKilometer = 1.0;
    public static final double MinPriceCollapse = 0.05;
    public static final double MaxPriceCollapse = 1.0;

    static Random random = new Random();

    public static void generateName(ComfortLineCar comfortLineCar){

        comfortLineCar.setName(NAMES[random.nextInt(NAMES.length - 1 - 0 + 1) + 0]);
    }

    public static void generatePriceForCar(ComfortLineCar comfortLineCar){

        comfortLineCar.setPriceForCar(random.nextInt(MaxPrice - MinPrice + 1) + MinPrice);
    }

    public static void generatePriceForKilometer(ComfortLineCar comfortLineCar){

        comfortLineCar.setPriceForKilometer(MinPriceForKilometer + (MaxPriceForKilometer - MinPriceForKilometer)
                * random.nextDouble());
    }

    public static void generateMinuteCollapse(ComfortLineCar comfortLineCar){

        comfortLineCar.setPriceForMinuteCollapse(MinPriceCollapse + (MaxPriceCollapse - MinPriceCollapse)
                * random.nextDouble());
    }

    public static void generateId(ComfortLineCar comfortLineCar, UtilInterface utilInterface){
        int countCars = utilInterface.getSizeAutoParkComfort() + utilInterface.getSizeAutoParkCheap();

        for (int i = 0; i < countCars; i++){
            int a = random.nextInt(countCars + 2 - 1) + 1;

            if (!utilInterface.checkListComfortForId(a) && !utilInterface.checkListCheapForId(a)){
                comfortLineCar.setId(a);
                break;
            }
        }
    }

    public static void generateDataCar(ComfortLineCar comfortLineCar, UtilInterface utilInterface){

        generateId(comfortLineCar, utilInterface);
        generateMinuteCollapse(comfortLineCar);
        generateName(comfortLineCar);
        generatePriceForCar(comfortLineCar);
        generatePriceForKilometer(comfortLineCar);

    }
}
