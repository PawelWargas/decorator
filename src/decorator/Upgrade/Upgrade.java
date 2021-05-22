package decorator.Upgrade;

public class Upgrade {
    private int mobility;
    private int penetration;
    private int armor;
    private String name;
    private boolean isPutOn;

    public int getMobility() {
        return mobility;
    }

    public int getPenetration() {
        return penetration;
    }

    public int getArmor() {
        return armor;
    }

    public String getName() {
        return name;
    }

    public void putOn() {
        isPutOn = true;
    }

    public void putOff() {
        isPutOn = false;
    }

    public boolean isPutOn() {
        return isPutOn;
    }
}
