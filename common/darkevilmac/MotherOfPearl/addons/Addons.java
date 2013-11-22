package darkevilmac.MotherOfPearl.addons;

import cpw.mods.fml.common.Loader;

public class Addons {

    private static int modDomNum = 0;

    public static void init() {
        System.out.println("[MOP] Attempting to join other mods in world Domination");
        if (Loader.isModLoaded("TConstruct")) {
            modDomNum++;
            //TinkersConstructAddon.init();
            System.out.println("[MOP] Joined Tinkers Construct in world Domination");
        }
        if (Loader.isModLoaded("better_appliances_core")) {
            modDomNum++;
            System.out.println("[MOP] Joined Better Appliances in world Domination");
        }
        if (Loader.isModLoaded("IC2")) {
            modDomNum++;
            IC2Addon.init();
            System.out.println("[MOP] Joined IC2 in world Domination");
        }

        System.out.println("[MOP] Joined a total of " + modDomNum + " mods in world Domination");
    }

}
