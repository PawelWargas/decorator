package decorator.Upgrade;

public class IPM1_Turret extends Upgrade {
    private final int penetration = 0;
    private final int mobility = -300;
    private final int armor = 200;
    private final String NAME = UpgradeType.IPM1_Turret.toString();
    private boolean isPutOn = false;
    private Upgrade upgrade;

    public IPM1_Turret(Upgrade upgrade) {
        this.upgrade = upgrade;
    }

    @Override
    public int getPenetration() {
        return upgrade.getPenetration() + penetration;
    }

    @Override
    public int getMobility() {
        return upgrade.getMobility() + mobility;
    }

    @Override
    public int getArmor() {
        return upgrade.getArmor() + armor;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
