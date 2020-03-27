package test.stagrey;

public class Soldiers {
    private Weapons weapons;

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public void doWork(){
        this.weapons.doFighting();
    }
}
