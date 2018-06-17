package by.TaxiExpress.Model.Util.CarUtil;

import by.TaxiExpress.Model.Entity.CheapLineCar;
import by.TaxiExpress.Model.Entity.ComfortLineCar;

public interface UtilInterface {

    public CheapLineCar[] getAutoparkCheap();

    public ComfortLineCar[] getAutoparkComfort();

    public boolean addCar(CheapLineCar car, UtilInterface utilInterface);

    public boolean addCar(ComfortLineCar comfortLineCar, UtilInterface utilInterface);

    public void createListCheap(int countCars);

    public void createListComfort(int countcars);

    public boolean removeById(int id);

    public boolean checkIsExistCheapList();

    public boolean checkIsExistComfortList();

    public CheapLineCar findByIdCheap(int id);

    public ComfortLineCar findByIdComfort(int id);

    public int getCoutCheap();

    public int getCountComfort();

    public int getCount();

    public boolean removeListCheap();

    public boolean removeListComfort();

    public boolean checkListCheapForId(int id);

    public boolean checkListComfortForId(int id);

    public int getSizeAutoParkCheap();

    public int getSizeAutoParkComfort();



}
