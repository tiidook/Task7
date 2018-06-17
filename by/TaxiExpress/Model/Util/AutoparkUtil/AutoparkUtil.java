package by.TaxiExpress.Model.Util.AutoparkUtil;

import by.TaxiExpress.Model.Entity.Container.Autopark;
import by.TaxiExpress.Model.Util.CarUtil.UtilInterface;
import by.TaxiExpress.Model.Util.Logic.AutoparkLogic;

public class AutoparkUtil {

    public static void calculateCountCars(Autopark autopark, UtilInterface utilInterface){

        autopark.setCountCars(utilInterface.getCount());
    }

    public static void calculateCountCheap(Autopark autopark, UtilInterface utilInterface){

        autopark.setCountCheapCars(utilInterface.getSizeAutoParkCheap());
    }


    public static void calculateCountComfort(Autopark autopark, UtilInterface utilInterface){

        autopark.setCountComfortCars(utilInterface.getSizeAutoParkComfort());
    }


    public static void calculateMostExpensiveCar(Autopark autopark, UtilInterface utilInterface){

        autopark.setMostExpensiveCar(AutoparkLogic.getMostExpensiveCar(utilInterface));
    }


    public static void calculateCheapestCaR(Autopark autopark, UtilInterface utilInterface){

        autopark.setCheapestCar(AutoparkLogic.getCheapestCar(utilInterface));
    }


    public static void calculateCheapestForKilometer(Autopark autopark, UtilInterface utilInterface){

        autopark.setCheapestCarForKilometer(AutoparkLogic.getCheapestCarForKilometer(utilInterface));
    }


    public static void calculateMostExpensiveCarForKilometer(Autopark autopark, UtilInterface utilInterface){

        autopark.setMostExpensiveCarForKilometer(AutoparkLogic.getMostExpensiveCarForKilometer(utilInterface));
    }


}
