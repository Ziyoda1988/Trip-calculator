package Assignment25OOPprogect;

public abstract class Vehicle {
    private double tollAmount;
    private double distanceTraveled;

    protected Vehicle(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public double getTollAmount() {
        return tollAmount;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setTollAmount(double tollAmount) {
        this.tollAmount = tollAmount;
    }

    public void setDistanceTraveled(double distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    abstract void calculateToll();
}
