class Fighter {

    boolean isVulnerable() {
        return true;
    }
    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter{
    @Override
    boolean isVulnerable(){
        return false;
    }
    @Override
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() ? 10 : 6;
    }
    public String toString(){
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter{

    private boolean vulnerable = true;
    private boolean spell = false;

    void prepareSpell(){
        this.spell = true;
        this.vulnerable = false;
    }
    @Override
    boolean isVulnerable(){
        return vulnerable;
    }
    @Override
    int getDamagePoints(Fighter fighter){
        return spell ? 12 : 3;
    }
    public String toString(){
        return "Fighter is a Wizard";
    }

}