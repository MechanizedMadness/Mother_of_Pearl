package darkevilmac.MotherOfPearl.misc;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageReg {

    public static void init() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.MoP", "en_US", "Mother of Pearl");
        LanguageRegistry.instance().addStringLocalization("itemGroup.MoP_WIP", "en_US", "Mother of Pearl - Unfinished Items");
    }

}
