package decorator;

import decorator.Upgrade.Upgrade;

public class Tank {
    private final Upgrade upgrade;
    private int mobility = 1000;
    private int penetration = 379;
    private int armor = 440;
    private boolean isCreated = false;

    public Tank() {
        this.upgrade = new Upgrade();
    }

    public void addUpgrade(Upgrade upgrade) {
        if (!upgrade.isPutOn() && isCreated) {
            this.penetration += upgrade.getPenetration();
            this.armor += upgrade.getArmor();
            this.mobility += upgrade.getMobility();

            upgrade.putOn();
            System.out.println("Added " + upgrade.getName());
            showStats();
        } else if (upgrade.isPutOn()) {
            removeUpgrade(upgrade);
        } else {
            System.out.println("Tank is not created");
        }
    }

    public void removeUpgrade(Upgrade upgrade) {
        this.penetration -= upgrade.getPenetration();
        this.armor -= upgrade.getArmor();
        this.mobility -= upgrade.getMobility();
        showStats();
        System.out.println("Removed " + upgrade.getName());
        upgrade.putOff();
    }

    public void showStats() {
        System.out.printf("Mobility: %d , Hit power: %d , Armor: %d%n", mobility, penetration, armor);
    }

    public Upgrade getUpgrade() {
        return upgrade;
    }

    public void create() {
        System.out.println("You have created M1 abrams");
        isCreated = true;
    }

    public boolean isCreated() {
        return isCreated;
    }
}
