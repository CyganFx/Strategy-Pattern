public class SwordBehaviour implements WeaponBehaviour {

    @Override
    public String type() {
        return meeleWeapon;
    }

    @Override
    public void useWeapon() {
        System.out.println(" using " + toString());
    }

    @Override
    public String toString() {
        return "sword";
    }
}
