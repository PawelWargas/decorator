package decorator.Upgrade;

public class AGT_1500_TURBINE extends Upgrade{
    private final int penetration = 0;
    private final int mobility = 700;
    private final int armor = -145;
    private final String NAME = UpgradeType.AGT_1500_TURBINE.toString();
    private boolean isPutOn = false;
    private Upgrade upgrade;

    public AGT_1500_TURBINE(Upgrade upgrade) {
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
