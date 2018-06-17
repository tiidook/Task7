package by.TaxiExpress.Model.Util.Logic;

import by.TaxiExpress.Model.Entity.CheapLineCar;
import by.TaxiExpress.Model.Util.CarUtil.UtilInterface;
import by.TaxiExpress.Model.Entity.ComfortLineCar;

public class AutoparkLogic {

    public static CheapLineCar getCheapestCar(UtilInterface utilInterface){
        int slots = utilInterface.getSizeAutoParkCheap();

        CheapLineCar cheapestCar = new CheapLineCar();
        CheapLineCar[] cheapLineCars = utilInterface.getAutoparkCheap();

        for (int i = 0; i < slots; i++){

            if (cheapLineCars[i] != null){

                cheapestCar = cheapLineCars[i];
                break;
            }
        }

        for (int i = 0; i < slots; i++){

            if (cheapLineCars[i] != null && (cheapLineCars[i].getPriceForCar() < cheapestCar.getPriceForCar())){
                cheapestCar = cheapLineCars[i];
            }
        }
        return cheapestCar;
    }

    public static ComfortLineCar getMostExpensiveCar(UtilInterface utilInterface){
        int slots = utilInterface.getSizeAutoParkComfort();

        ComfortLineCar mostExpensiveCar = new ComfortLineCar();
        mostExpensiveCar.setPriceForCar(0);
        ComfortLineCar[] comfortLineCars = utilInterface.getAutoparkComfort();

        for (int i = 0; i < slots; i++){

           if (comfortLineCars[i] != null && (comfortLineCars[i].getPriceForCar() > mostExpensiveCar.getPriceForCar())){

               mostExpensiveCar = comfortLineCars[i];
           }
        }
        return mostExpensiveCar;
    }

    public static CheapLineCar getCheapestCarForKilometer(UtilInterface utilInterface){
        int slots = utilInterface.getSizeAutoParkCheap();

        CheapLineCar cheapestCar = new CheapLineCar();
        CheapLineCar[] cheapLineCars = utilInterface.getAutoparkCheap();

        for (int i = 0; i < slots; i++){

            if (cheapLineCars[i] != null){

                cheapestCar = cheapLineCars[i];
                break;
            }
        }

        for (int i = 0; i < slots; i++){

            if (cheapLineCars[i] != null && (cheapLineCars[i].getPriceForKilometer()
                    < cheapestCar.getPriceForKilometer())){
                cheapestCar = cheapLineCars[i];
            }
        }
        return cheapestCar;
    }

    public static ComfortLineCar getMostExpensiveCarForKilometer(UtilInterface utilInterface){
        int slots = utilInterface.getSizeAutoParkComfort();

        ComfortLineCar mostExpensiveCar = new ComfortLineCar();
        mostExpensiveCar.setPriceForKilometer(0);
        ComfortLineCar[] comfortLineCars = utilInterface.getAutoparkComfort();

        for (int i = 0; i < slots; i++){

            if (comfortLineCars[i] != null && (comfortLineCars[i].getPriceForKilometer()
                    > mostExpensiveCar.getPriceForKilometer())){

                mostExpensiveCar = comfortLineCars[i];
            }
        }
        return mostExpensiveCar;
    }

}
