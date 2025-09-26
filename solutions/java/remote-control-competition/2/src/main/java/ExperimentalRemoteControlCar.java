public class ExperimentalRemoteControlCar implements RemoteControlCar{
    private int travel;

    @Override
    public void drive() {
        this.travel += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.travel;
    }
}