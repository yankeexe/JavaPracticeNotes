public abstract class Crashable{
    /**variables defined inside abstract need not be constants like in the Interface */
    boolean carDrivable = true;
    
    public void youCrashed(){
        this.carDrivable = false;
    }

    public abstract void setCarStrength(int carStrength);
    public abstract int getCarStrength();
}