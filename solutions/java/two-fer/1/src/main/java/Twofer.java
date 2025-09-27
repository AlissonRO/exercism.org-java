public class Twofer {
    public String twofer(String name) {
        return name == null ?"One for you, one for me.":"One for "+name+", one for me.";
    }
    //    Another way :
/*
   public String twofer(String name) {
        return "One for "+name+", one for me.";
    }
   public String twofer(){
        return "One for you, one for me.";
    }
*/
}
