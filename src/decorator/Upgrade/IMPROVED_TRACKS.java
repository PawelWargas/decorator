package decorator.Upgrade;

public class IMPROVED_TRACKS extends Upgrade{
    private final int penetration = 0;
    private final int mobility = -80;
    private final int armor = 100;
    private final String NAME = UpgradeType.IMPROVED_TRACKS.toString();
    private boolean isPutOn = false;
    private Upgrade upgrade;

    public IMPROVED_TRACKS(Upgrade upgrade) {
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
