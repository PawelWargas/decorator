package decorator.Upgrade;

public class M829A1_APFSDS extends Upgrade {
    private final int penetration = 366;
    private final int mobility = -90;
    private final int armor = 0;
    private final String NAME = UpgradeType.M829A1_APFSDS.toString();
    private boolean isPutOn = false;
    private Upgrade upgrade;

    public M829A1_APFSDS(Upgrade upgrade) {
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
