public class NewVehicle{
    public static void main(String[] args)
    {

        /**This is with the parameterized constructor */
        Vehicle car = new Vehicle(4,50);
        System.out.println("The number of wheels on a car is: " + car.numberOfWheels);
        System.out.println("The top speed of the car is: " + car.theSpeed);
        System.out.println("The strength of the car is: " + car.carStrength);

        /**If it was the default constructor then we have to work like this */
        Vehicle bike = new Vehicle();
        bike.numberOfWheels = 2;
        bike.setSpeed(100);
        System.out.println("Number of wheels on a bike is: " + bike.numberOfWheels);
        System.out.println("Speed of bike is: " + bike.theSpeed);

        /**Use of Abstract Class methods */
        car.setCarStrength(100);
        System.out.println("The strength of car is: " + car.carStrength);


    }
}