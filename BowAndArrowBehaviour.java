public class BowAndArrowBehaviour implements WeaponBehaviour {

    @Override
    public String type() {
        return rangeWeapon;
    }

    @Override
    public void useWeapon() {
        System.out.println(" using " + toString());
    }

    @Override
    public String toString() {
        return "bow and arrow";
    }
}
