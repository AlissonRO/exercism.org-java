class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int travel;
    private int victories;

    @Override
    public void drive() {
        this.travel += 10;
    }

    @Override
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
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.getNumberOfVictories(), getNumberOfVictories());
    }
}