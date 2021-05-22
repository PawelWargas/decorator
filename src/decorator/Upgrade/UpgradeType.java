package decorator.Upgrade;

public enum UpgradeType {
    IPM1_Turret("IMP1 turret"),
    M256_CANNON("M256 cannon"),
    AGT_1500_TURBINE("AGT-1500 engine"),
    IMPROVED_TRACKS("Improved Tracks"),
    M829A1_APFSDS("M829A1 silver bullet ammunition");


    private String name;

    UpgradeType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
