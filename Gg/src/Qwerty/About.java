package Qwerty;

import java.util.List;

public class About {
    private static int numberOfCallsCarrrInfo = 0;
    private static int numberOfCallsOwnerInfo = 0;
    public static String getCarrrInfo(Carrr car){
        numberOfCallsCarrrInfo++;
        return "" + car.getNumber() + " " + car.getColor() + car.getProduction();
    }

    public static Carrr findCar(List<Carrr> cars, String line) {
        for(Carrr car: cars){
            if(car.getNumber().equals(line)){
                return car;
            }
        }
        return null;
    }

    public static Owner findOwner(List<Owner> owners, String line) {
        for(Owner owner: owners){
            if(owner.getName().equals(line)){
                return owner;
            }
        }
        return null;
    }
}