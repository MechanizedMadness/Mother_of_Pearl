package tcc.MotherOfPearl.tools;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import tcc.MotherOfPearl.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import darkevilmac.MotherOfPearl.lib.ItemStacks;

public class ModTools {

    public static Item shovelPearl;
    public static Item shovelBlackPearl;
    public static Item swordPearl;
    public static Item swordBlackPearl;
    public static Item bowPearl;
    public static Item knifePearl;
    public static Item mortarAndPestle;
    public static Item portableCooker;

    public static EnumToolMaterial pearlShovel = EnumHelper.addToolMaterial("PearlShovel", 2, 256, 2f, 3f, 25);
    public static EnumToolMaterial pearlSword = EnumHelper.addToolMaterial("PearlSword", 2, 256, 1f, 2f, 25);
    public static EnumToolMaterial pearlKnife = EnumHelper.addToolMaterial("PearlKnife", 2, 1000, .5f, 1f, 25);

    public static void init() {
        defTools();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defTools() {
        bowPearl = new ItemPearlBow(MOPConfiguration.bowPearlID);
        knifePearl = new ItemPearlKnife(MOPConfiguration.knifePearlID, pearlKnife);
        shovelPearl = new ItemPearlShovel(MOPConfiguration.shovelPearlID);
        shovelBlackPearl = new ItemBlackPearlShovel(MOPConfiguration.shovelBlackPearlID);
        swordPearl = new ItemPearlSword(MOPConfiguration.swordPearlID);
        swordBlackPearl = new ItemBlackPearlSword(MOPConfiguration.swordBlackPearlID);
        mortarAndPestle = new ItemMortarAndPestle(MOPConfiguration.mortarAndPestleID);
        portableCooker = new ItemPortableCooker(MOPConfiguration.portableCookerID);
    }

    public static void initGameRegistry() {

    }

    public static void initCrafting() {
        GameRegistry.addRecipe(new ItemStack(shovelPearl, 1), "y", "x", "x", 'x', ItemStacks.stick, 'y', ModItems.pearl);
        GameRegistry.addRecipe(new ItemStack(shovelBlackPearl, 1), "y", "x", "x", 'x', ItemStacks.stick, 'y', ModItems.blackPearl);
        GameRegistry.addRecipe(new ItemStack(swordPearl, 1), "y", "y", "x", 'x', ItemStacks.stick, 'y', ModItems.pearl);
        GameRegistry.addRecipe(new ItemStack(swordBlackPearl, 1), "y", "y", "x", 'x', ItemStacks.stick, 'y', ModItems.blackPearl);
        GameRegistry.addRecipe(new ItemStack(bowPearl, 1), "zx ", "z y", "zx ", 'x', ItemStacks.stick, 'y', ItemStacks.pearl, 'z', ItemStacks.string);
        GameRegistry.addRecipe(new ItemStack(bowPearl, 1), " xz", "y z", " xz", 'x', ItemStacks.stick, 'y', ItemStacks.pearl, 'z', ItemStacks.string);
        GameRegistry.addRecipe(new ItemStack(knifePearl, 1), "y", "x", 'x', ItemStacks.stick, 'y', ModItems.pearl);
        GameRegistry.addRecipe(new ItemStack(mortarAndPestle, 1), "y", "x", 'x', ModItems.mortar, 'y', ModItems.pestle);
        //Buggy Fire Use creative Portal Placer
        GameRegistry.addRecipe(ItemStacks.lighter, "  p", " f ", "s  ", 'f', ItemStacks.matches, 'p', ModItems.pearlDiamond, 's', ItemStacks.stick);
        GameRegistry.addRecipe(new ItemStack(portableCooker, 1), "b", "m", "b", 'b', ModItems.mortar, 'm', ModItems.magnificentPearl);
    }

    public static void initLanguageRegistry() {
        LanguageRegistry.addName(bowPearl, "Pearl Bow");
        LanguageRegistry.addName(knifePearl, "Pearling Knife");
        LanguageRegistry.addName(shovelPearl, "Pearl Shovel");
        LanguageRegistry.addName(shovelBlackPearl, "Black Pearl Shovel");
        LanguageRegistry.addName(swordPearl, "Pearl Sword");
        LanguageRegistry.addName(swordBlackPearl, "Black Pearl Sword");
        LanguageRegistry.addName(mortarAndPestle, "Mortar And Pestle");
        LanguageRegistry.addName(portableCooker, "Portable Cooker");
    }

}
