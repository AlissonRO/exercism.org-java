class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if(speed == 0)return 0.0;
        int production = speed * 221;

        return speed < 5 ? production
                : speed < 9 ? production  * 0.9
                : speed < 10 ? production  * 0.8
                : production  * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
