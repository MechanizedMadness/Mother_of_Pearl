package darkevilmac.MotherOfPearl.misc;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageReg {

    public static void init() {
        LanguageRegistry.instance().addStringLocalization("itemGroup.MoP", "en_US", "Mother of Pearl");
        //LanguageRegistry.instance().addStringLocalization("itemGroup.MoP_WIP", "en_US", "Mother of Pearl - Unfinished Items");
        LanguageRegistry.instance().addStringLocalization("enchantment.nightvision", "en_US", "Felis Oculus");
        LanguageRegistry.instance().addStringLocalization("enchantment.angelwings", "en_US", "Angeli Alae");
        LanguageRegistry.instance().addStringLocalization("enchantment.jumping", "en_US", "Salire Luna");
        LanguageRegistry.instance().addStringLocalization("enchantment.swiftness", "en_US", "Velocitas");
    }

}
