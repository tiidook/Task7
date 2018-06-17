package by.TaxiExpress.Controller;

import by.TaxiExpress.Model.Util.CarUtil.UtilInterface;
import by.TaxiExpress.Model.AutoparkManager;
import by.TaxiExpress.Model.Entity.CheapLineCar;
import by.TaxiExpress.Model.Entity.ComfortLineCar;
import by.TaxiExpress.Model.Entity.Container.Autopark;
import by.TaxiExpress.Model.Util.CarUtil.UtilLogic;
import by.TaxiExpress.View.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        UtilInterface managerInterface = new UtilLogic();

        int countCheapCars = 6;
        int countComfortCars = 6;

        managerInterface.createListCheap(countCheapCars);
        managerInterface.createListComfort(countComfortCars);

        for (int i = 0; i < countCheapCars; i++){

            CheapLineCar car = new CheapLineCar();
            managerInterface.addCar(car,managerInterface);
        }

        for (int i = 0; i < countComfortCars; i++){

            ComfortLineCar car = new ComfortLineCar();
            managerInterface.addCar(car,managerInterface);
        }

        CheapLineCar[] cheapLineCar = managerInterface.getAutoparkCheap();
        ComfortLineCar[] comfortLineCars = managerInterface.getAutoparkComfort();

        Printer.print("All the cars" + Arrays.toString(cheapLineCar) + Arrays.toString(comfortLineCars));

        Autopark autopark = new Autopark();

        AutoparkManager.createAutopark(autopark,managerInterface);

        Printer.print("Cheapest car for custemers is" + autopark.getCheapestCarForKilometer().toString());
        Printer.print("The most Expensive car is" + autopark.getMostExpensiveCar().toString());
        Printer.print("Total count of cars:" + autopark.getCountCars());
        Printer.print("The most expensive car for customers is: " + autopark.getMostExpensiveCarForKilometer());


        CheapLineCar carr = new CheapLineCar();
        managerInterface.addCar(carr,managerInterface);

        AutoparkManager.updateAutopark(autopark,managerInterface);

      }
    }

