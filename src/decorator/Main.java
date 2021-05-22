package decorator;
import decorator.Upgrade.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        Tank tank = new Tank();
        Upgrade IPM1_Turret = new IPM1_Turret(tank.getUpgrade());
        Upgrade M256_Cannon = new M256_CANNON(tank.getUpgrade());
        Upgrade AGT_1500_Turbine = new AGT_1500_TURBINE(tank.getUpgrade());
        Upgrade Improved_Tracks = new IMPROVED_TRACKS(tank.getUpgrade());
        Upgrade M829A1_Apfds = new M829A1_APFSDS(tank.getUpgrade());

        menu();

        for (; ; ) {

            switch (input = scanner.nextLine().charAt(0)) {

                case '1':
                    tank.create();
                    break;


                case '2':
                    if (!tank.getUpgrade().isPutOn())
                        tank.addUpgrade(IPM1_Turret);
                    break;


                case '3':
                    if (!tank.getUpgrade().isPutOn())
                        tank.addUpgrade(M256_Cannon);
                    break;

                case '4':
                    if (!tank.getUpgrade().isPutOn())
                        tank.addUpgrade(AGT_1500_Turbine);
                    break;

                case '5':
                    if (!tank.getUpgrade().isPutOn())
                        tank.addUpgrade(Improved_Tracks);
                    break;

                case '6':
                    if (!tank.getUpgrade().isPutOn())
                        tank.addUpgrade(M829A1_Apfds);
                    break;

                case 's':
                        tank.showStats();
                        break;

                case 'm':
                    menu();
                    break;

                case '0':
                    System.exit(0);

            }
        }
    }

    public static void menu() {
        System.out.println("Press '1' to create tank");
        System.out.println("Press 's' to show stats");
        System.out.println("Press '2' to add/remove " + UpgradeType.IPM1_Turret);
        System.out.println("Press '3' to add/remove " + UpgradeType.M256_CANNON);
        System.out.println("Press '4' to add/remove " + UpgradeType.AGT_1500_TURBINE);
        System.out.println("Press '5' to add/remove " + UpgradeType.IMPROVED_TRACKS);
        System.out.println("Press '6' to add/remove " + UpgradeType.M829A1_APFSDS);
        System.out.println("Press 'm' to show menu");
        System.out.println("Press '0' to exit.");
    }
}