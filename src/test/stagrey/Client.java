package test.stagrey;

public class Client {
    public static void main(String[] args) {
        Gun gun = new Gun();
        Soldiers soldiers = new Soldiers();
        soldiers.setWeapons(gun);
        soldiers.doWork();

        soldiers.setWeapons(new Knife());
        soldiers.doWork();
    }
}
