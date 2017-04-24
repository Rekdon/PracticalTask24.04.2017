/**
 * Created by Rekdon on 24.04.2017.
 */
public class Plane extends Mashine {
    private int mass;
    private int numberOfPassengers;
    private int numberOfWheels;
    private int numberOfPilots;


    public Plane(String name, int speedNow) {
        super(name, speedNow);
    }

    public Plane(String name, int speedNow, int mass, int numberOfPassengers, int numberOfWheels, int numberOfPilots) {
        super(name, speedNow);
        this.mass = mass;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfWheels = numberOfWheels;
        this.numberOfPilots = numberOfPilots;
    }


    @Override
    public int getMass() {
        return mass;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfPilots() {
        return numberOfPilots;
    }

    @Override
    public String toString() {
        return  "          Інформація про літак         "+"\n"+
                "Назва літака : " + getName()+"\n" +
                "швидкість в даний момент : " + getSpeed() +"\n"+
                "загальна вага літака : " + getMass() + "\n"+
                "кількість пасажирів : " + getNumberOfPassengers() +"\n"+
                "кількість коліс : " + getNumberOfWheels() +"\n"+
                "кількість пілотів :" + getNumberOfPilots() ;
    }
}
