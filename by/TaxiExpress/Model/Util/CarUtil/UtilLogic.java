package by.TaxiExpress.Model.Util.CarUtil;

import by.TaxiExpress.Model.Entity.CheapLineCar;
import by.TaxiExpress.Model.Util.GenerateDataCar.GenerateLogicComfortCar;
import by.TaxiExpress.Model.Entity.ComfortLineCar;
import by.TaxiExpress.Model.Util.GenerateDataCar.GenerateLogicCheapCar;

public class UtilLogic implements UtilInterface {

    ComfortLineCar[] autoparkComfort;
    CheapLineCar[] autoparkCheap;

    @Override
    public void createListCheap(int countCars) {
        autoparkCheap = new CheapLineCar[countCars];
    }

    @Override
    public void createListComfort(int countCars) {
        autoparkComfort = new ComfortLineCar[countCars];
    }

    @Override
    public boolean removeById(int id) {

        if (checkListCheapForId(id)) {

            for (int i = 0; i < autoparkCheap.length; i++) {

                if (autoparkCheap[i].getId() == id) {
                    autoparkCheap[i] = null;
                    return true;
                }
            }
        } else if (checkIsExistComfortList()) {

            for (int i = 0; i < autoparkComfort.length; i++) {

                if (autoparkComfort[i].getId() == id) {
                    autoparkComfort[i] = null;
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public boolean checkListCheapForId(int id) {

        if (checkIsExistCheapList()) {

            for (int i = 0; i < autoparkCheap.length; i++) {

                if (autoparkCheap[i] != null && autoparkCheap[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean checkListComfortForId(int id) {

        if (checkIsExistComfortList()) {

            for (int i = 0; i < autoparkComfort.length; i++) {

                if (autoparkComfort[i] != null && autoparkComfort[i].getId() == id) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int getSizeAutoParkCheap() {

        if(checkIsExistCheapList()){
            return autoparkCheap.length;
        }
        return 0;
    }

    @Override
    public int getSizeAutoParkComfort() {

        if (checkIsExistComfortList()){
            return autoparkComfort.length;
        }
        return 0;
    }


    @Override
    public boolean checkIsExistCheapList() {

        return autoparkCheap != null ? true : false;
    }


    @Override
    public boolean checkIsExistComfortList() {

        return autoparkComfort != null ? true : false;
    }

    @Override
    public CheapLineCar findByIdCheap(int id) {

        for (int i = 0; i < autoparkCheap.length; i++) {

            if (autoparkCheap[i] != null && autoparkCheap[i].getId() == id) {

                return autoparkCheap[i];
            }
        }
        return null;
    }


    @Override
    public ComfortLineCar findByIdComfort (int id) {

            for (int i = 0; i < autoparkComfort.length; i++){

                if (autoparkComfort[i] != null && autoparkComfort[i].getId() == id){

                    return autoparkComfort[i];
                }
            }
        return null;
    }

    @Override
    public int getCoutCheap() {
        int count = 0;

        if (checkIsExistCheapList()){

            for (int i = 0; i < autoparkCheap.length; i++){

                if (autoparkCheap[i] != null){
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int getCountComfort() {
        int count = 0;

        if (checkIsExistComfortList()){

            for (int i = 0; i < autoparkComfort.length; i++){

                if (autoparkComfort[i] != null){
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int getCount() {
        return getCoutCheap() + getCountComfort();
    }

    @Override
    public boolean removeListCheap() {

        if (checkIsExistCheapList()){

            autoparkCheap = null;
            return true;
        }

        return false;
    }

    @Override
    public boolean removeListComfort() {

        if (checkIsExistComfortList()){

            autoparkComfort = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean addCar(CheapLineCar car, UtilInterface utilInterface){

        if(checkIsExistCheapList()) {

            for (int i = 0; i < autoparkCheap.length; i++) {

                if (autoparkCheap[i] == null) {
                    GenerateLogicCheapCar.generateDataCar(car, utilInterface);
                    autoparkCheap[i] = car;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addCar(ComfortLineCar comfortLineCar, UtilInterface utilInterface) {

        if (checkIsExistComfortList()) {

            for (int i = 0; i < autoparkComfort.length; i++) {

                if (autoparkComfort[i] == null) {
                    GenerateLogicComfortCar.generateDataCar(comfortLineCar, utilInterface);
                    autoparkComfort[i] = comfortLineCar;
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public CheapLineCar[] getAutoparkCheap(){

        return autoparkCheap;
    }

    @Override
    public ComfortLineCar[] getAutoparkComfort(){

        return autoparkComfort;
    }



}
