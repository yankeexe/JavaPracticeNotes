 /**Interfaces are basically compact */
public interface Drivable { 
    double PI = 3.14;
    double getSpeed();
    void setSpeed(double speed);

    /**Whenever we are defining methods inside an interface, they are already abstract methods.
     * Meaning: here `void setSpeed(double speed)` is in fact:`public abstract void setSpeed(double speed)`;
     */

     int getWheel();
     void setWheels(int numWheels);
}