class SpaceAge {
    private final double ageInSeconds;
    
    SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
    }
    double getSeconds() {
        return this.ageInSeconds;
    }
    double onEarth() {
        return this.ageInSeconds / 31_557_600;
    }
    double onMercury() {
        return this.ageInSeconds / (31_557_600 * 0.2408467);
    }
    double onVenus() {
        return this.ageInSeconds / (31_557_600 * 0.61519726);
    }
    double onMars() {
        return this.ageInSeconds / (31_557_600 * 1.8808158);
    }
    double onJupiter() {
        return this.ageInSeconds / (31_557_600 * 11.862615);
    }
    double onSaturn() {
        return this.ageInSeconds / (31_557_600 * 29.447498);
    }
    double onUranus() {
        return this.ageInSeconds / (31_557_600 * 84.016846);
    }
    double onNeptune() {
        return this.ageInSeconds / (31_557_600 * 164.79132);
    }
}
