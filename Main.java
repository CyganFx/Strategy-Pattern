public class Main {

    public static void main(String[] args) {
        Character artur = new King();
        Character elizabeth = new Queen();
        Character saber = new Knight();
        artur.fight();
        elizabeth.fight();
        saber.fight();
        artur.setWeapon(new BowAndArrowBehaviour());
        artur.fight();
    }
}
