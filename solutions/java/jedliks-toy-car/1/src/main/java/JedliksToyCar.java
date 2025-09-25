public class JedliksToyCar {
    private int metters;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
      return new JedliksToyCar();
    }

    public String distanceDisplay() {
       return "Driven "+this.metters+" meters";
    }

    public String batteryDisplay() {
        if(this.battery == 0){
            return "Battery empty";
        }
        return "Battery at "+this.battery+"%";
    }

    public void drive() {
        if(this.battery != 0){
            this.battery--;
            this.metters += 20;
        }
        
    }
}
