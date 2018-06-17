package by.TaxiExpress.Model;

import by.TaxiExpress.Model.Entity.Container.Autopark;
import by.TaxiExpress.Model.Util.CarUtil.UtilInterface;
import by.TaxiExpress.Model.Util.AutoparkUtil.AutoparkUtil;

public class AutoparkManager {

    public static void createAutopark(Autopark autopark, UtilInterface utilInterface){

        AutoparkUtil.calculateCheapestForKilometer(autopark,utilInterface);
        AutoparkUtil.calculateCheapestCaR(autopark,utilInterface);
        AutoparkUtil.calculateCountCars(autopark,utilInterface);
        AutoparkUtil.calculateCountCheap(autopark,utilInterface);
        AutoparkUtil.calculateCountComfort(autopark,utilInterface);
        AutoparkUtil.calculateMostExpensiveCar(autopark,utilInterface);
        AutoparkUtil.calculateMostExpensiveCarForKilometer(autopark,utilInterface);

    }

    public static void updateAutopark(Autopark autopark, UtilInterface utilInterface){

        createAutopark(autopark,utilInterface);
    }
}
