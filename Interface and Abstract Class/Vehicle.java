/**abstract class goes before Interface that's why we write extends Crashable before implements Interface */
public class Vehicle extends Crashable implements Drivable {
    int numberOfWheels = 4;
    double theSpeed = 0;
    int carStrength = 0;

    /**All the methods of Drivable Interface.
     * When we are implementing an interface,
     * the class should contain all the methods
     * of the interface.
     */
    public double getSpeed(){
        return theSpeed;
    }

    public void setSpeed(double speed){
        this.theSpeed = speed;
    }

    public int getWheel(){
        return numberOfWheels;
    }

    public void setWheels(int numWheels){
        this.numberOfWheels = numWheels;
    }

    /**Parameterized Constructor */
    public Vehicle(int wheels, double speed){
        this.numberOfWheels = wheels;
        this.theSpeed = speed;
    }

    /**Default Constructor */
    public Vehicle(){

    }

    /**Derived from Abstract Class */
    public void setCarStrength(int carStrength){
        this.carStrength = carStrength;
    }
    public int getCarStrength(){
        return this.carStrength;
    }
}