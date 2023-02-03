package Assignment25OOPprogect;

public class Car extends Vehicle {
    private boolean hasTrailer;
    private boolean isHov;

    public Car(double distanceTraveled, boolean hasTrailer, boolean isHov) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHov = isHov;
        calculateToll();

    }

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public boolean isHov() {
        return isHov;

    }

    @Override
    void calculateToll() {
        if (!isHov){
            setTollAmount(getDistanceTraveled() * 0.02); }
        if (hasTrailer){
            setTollAmount(getTollAmount() + 1.00); }}

    @Override
    public String toString() {
        return "Car               " + getDistanceTraveled() + "              " + "$" + this.getTollAmount();
    }}

