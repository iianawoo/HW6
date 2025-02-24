package HW6;
public class main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeapon(new Weapon(WeaponType.SWORD, "Doomblade"));
        boss.printInfo();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(20);
        skeleton1.setWeapon(new Weapon(WeaponType.BOW, "Bone Bow"));
        skeleton1.setArrows(30);
        skeleton1.printInfo();

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(15);
        skeleton2.setWeapon(new Weapon(WeaponType.BOW, "Shadow Bow"));
        skeleton2.setArrows(25);
        skeleton2.printInfo();
    }
}

