class ProductionRemoteControlCar implements RemoteControlCar, Comparable{

    private int travel;
    private int victories;

    public void drive() {
        this.travel += 10;
    }

    public int getDistanceTravelled() {
        return this.travel;
    }

    public int getNumberOfVictories() {
        return this.victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(Object o) {
        ProductionRemoteControlCar other = (ProductionRemoteControlCar) o;
        return Integer.compare(other.victories, this.victories);
    }
}