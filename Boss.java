package HW6;
public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss: Health = " + getHealth() + ", Damage = " + getDamage() +
                ", Weapon = " + weapon.getType() + " - " + weapon.getName());
    }
}

