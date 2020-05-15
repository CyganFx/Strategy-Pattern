public abstract class Character {

    protected WeaponBehaviour weapon;
    protected FightBehaviour attackDistance;

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    private void setAttackDistance() {
        if (weapon.type().equals(WeaponBehaviour.meeleWeapon)) {
            attackDistance = new CloseAttack();
        } else {
            attackDistance = new RangeAttack();
        }
    }

    public void fight() {
        System.out.print(getClass().getName() + " ");
        setAttackDistance();
        attackDistance.showRange();
        weapon.useWeapon();
    }
}
