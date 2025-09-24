
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : this.birdsPerDay) {
            if (birds == 0) {
                return true;
            }
        }
        return false;
    }

public int getCountForFirstDays(int numberOfDays) {
    int birdsCount = 0;
    int daysToCount = Math.min(numberOfDays, birdsPerDay.length);
    for (int i = 0; i < daysToCount; i++) {
        birdsCount += birdsPerDay[i];
    }
    return birdsCount;
}

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : this.birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}