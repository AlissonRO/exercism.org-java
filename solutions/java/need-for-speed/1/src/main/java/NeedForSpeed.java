class NeedForSpeed {
    private int battery = 100;
    private int speed;
    private int batteryDrain;
    private int distance = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            battery -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        // simula até acabar a bateria
        while (!car.batteryDrained()) {
            car.drive();
            if (car.distanceDriven() >= this.distance) {
                return true;
            }
        }
        return false;
    }
}
