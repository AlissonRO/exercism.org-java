public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int travel;

    public void drive() {
        this.travel += 20;
    }

    public int getDistanceTravelled() {
        return this.travel;
    }
}