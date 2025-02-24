package HW6;
public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public void printInfo() {
        System.out.println("Skeleton: Health = " + getHealth() + ", Damage = " + getDamage() +
                ", Weapon = " + getWeapon().getType() + " - " + getWeapon().getName() +
                ", Arrows = " + arrows);
    }
}
