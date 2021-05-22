package decorator.Upgrade;

public class M256_CANNON extends Upgrade {
    private final int penetration = 420;
    private final int mobility = -157;
    private final int armor = 0;
    private final String NAME = UpgradeType.M256_CANNON.toString();
    private boolean isPutOn = false;
    private Upgrade upgrade;

    public M256_CANNON(Upgrade upgrade) {
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
