package tcc.MotherOfPearl.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tcc.MotherOfPearl.MotherOfPearl;
import tcc.MotherOfPearl.tools.ItemPearlIgniter;
import tcc.MotherOfPearl.tools.ItemPortalPlacer;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import darkevilmac.MotherOfPearl.lib.ItemStacks;

public class ModItems {

    public static Item pearlIgniter;
    public static Item pearlPortalPlacer;
    public static Item blackPearl;
    public static Item oyster;
    public static Item oysterMeat;
    public static Item pearl;
    public static Item shell;
    public static Item pearlDiamond;
    public static Item blackPearlDiamond;
    public static Item dustPearl;
    public static Item dustBlackPearl;
    public static Item dustIron;
    public static Item dustGold;
    public static Item mortar;
    public static Item pestle;
    public static Item magnificentPearl;
    public static Item dustStrange;

    public static void init() {
        defItems();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defItems() {
        pearlIgniter = new ItemPearlIgniter(MOPConfiguration.pearlIgniterID);
        pearlPortalPlacer = new ItemPortalPlacer(MOPConfiguration.pearlPortalPlacerID);
        blackPearl = new ItemBlackPearl(MOPConfiguration.blackPearlID);
        oyster = new ItemOyster(MOPConfiguration.oysterID);
        oysterMeat = new ItemOysterMeat(MOPConfiguration.oysterMeatID, true, 4);
        pearl = new ItemPearl(MOPConfiguration.pearlID);
        shell = new ItemShell(MOPConfiguration.shellID);
        pearlDiamond = new ItemPearlDiamond(MOPConfiguration.pearlDiamondID);
        blackPearlDiamond = new ItemBlackPearlDiamond(MOPConfiguration.blackPearlDiamondID);
        dustPearl = new ItemDustPearl(MOPConfiguration.dustPearlID);
        dustBlackPearl = new ItemDustBlackPearl(MOPConfiguration.dustBlackPearlID);
        dustIron = new ItemDustIron(MOPConfiguration.dustIronID);
        dustGold = new ItemDustGold(MOPConfiguration.dustGoldID);
        mortar = new ItemMortar(MOPConfiguration.mortarID);
        pestle = new ItemPestle(MOPConfiguration.pestleID);
        magnificentPearl = new ItemMagnificentPearl(MOPConfiguration.magnificentPearlID);
        dustStrange = new ItemDustStrange(MOPConfiguration.dustStrangeID);
    }

    public static void initGameRegistry() {

    }

    public static void initCrafting() {
        GameRegistry.addRecipe(new ItemStack(blackPearl, 8), "yyy", "yby", "yyy", 'b', ItemStacks.inkSac, 'y', pearl);
        GameRegistry.addRecipe(new ItemStack(dustBlackPearl, 8), "yyy", "yby", "yyy", 'b', ItemStacks.inkSac, 'y', dustPearl);
        GameRegistry.addSmelting(oyster.itemID, new ItemStack(oysterMeat), 0.1f);
        GameRegistry.addShapelessRecipe(ItemStacks.blackPearlDiamond, ItemStacks.blackPearl, ItemStacks.diamond);
        GameRegistry.addShapelessRecipe(ItemStacks.blackPearlDiamond, ItemStacks.dustBlackPearl, ItemStacks.diamond);
        GameRegistry.addShapelessRecipe(ItemStacks.pearlDiamond, ItemStacks.pearl, ItemStacks.diamond);
        GameRegistry.addShapelessRecipe(ItemStacks.pearlDiamond, ItemStacks.dustPearl, ItemStacks.diamond);
        // Uses Pearling Knife to split an oyster into two shells. Gets 30 uses,
        // making a total of 60 shells.
        // (If only used in the crafting recipe.)
        // Thank you to DeverionX for the great tutorial on MinecraftForums.
        GameRegistry.addShapelessRecipe(new ItemStack(shell, 2), ItemStacks.oyster, ItemStacks.knifePearl);
        // adding a (fairly less efficient) way to get pearls w/o pearling
        // knife.
        GameRegistry.addShapelessRecipe(new ItemStack(pearl, 1), ItemStacks.oyster, ItemStacks.stone);
        // Using the Pearling Knife to make pearls from Oysters. Again 30 Uses
        // makes 240 Pearls (@8 pearls for each use)
        GameRegistry.addRecipe(new ItemStack(pearl, 8), "yyy", "yxy", "yyy", 'x', ItemStacks.knifePearl, 'y', oyster);
        GameRegistry.addShapelessRecipe(new ItemStack(dustIron, 2), ItemStacks.oreIron, ItemStacks.mortarAndPestle);
        GameRegistry.addShapelessRecipe(new ItemStack(dustGold, 2), ItemStacks.oreGold, ItemStacks.mortarAndPestle);
        GameRegistry.addShapelessRecipe(new ItemStack(dustPearl, 2), pearl, ItemStacks.mortarAndPestle);
        GameRegistry.addShapelessRecipe(new ItemStack(dustBlackPearl, 2), blackPearl, ItemStacks.mortarAndPestle);
        GameRegistry.addShapelessRecipe(new ItemStack(Block.sand, 2), ItemStacks.cobblestone, ItemStacks.mortarAndPestle);
        GameRegistry.addSmelting(dustIron.itemID, ItemStacks.ingotIron, 0.1f);
        GameRegistry.addSmelting(dustGold.itemID, ItemStacks.ingotGold, 0.1f);
        GameRegistry.addRecipe(new ItemStack(pestle, 1), " s", "d ", 's', ItemStacks.stick, 'd', ItemStacks.diamond);
        GameRegistry.addRecipe(new ItemStack(mortar, 1), "d d", " d ", 'd', ItemStacks.diamond);
        GameRegistry.addSmelting(dustStrange.itemID, new ItemStack(magnificentPearl), 0.5f);
        GameRegistry.addRecipe(new ItemStack(dustStrange, 1), "rrr", "pxp", "iii", 'r', ItemStacks.redstone, 'p', ModItems.dustPearl, 'x', ItemStacks.blazePowder, 'i', ModItems.dustIron);
        GameRegistry.addRecipe(ItemStacks.cookedBeef, "fff", "fpf", "fff", 'f', ItemStacks.beef, 'p', ItemStacks.portableCooker);
        GameRegistry.addRecipe(ItemStacks.cookedPork, "fff", "fpf", "fff", 'f', ItemStacks.pork, 'p', ItemStacks.portableCooker);
        GameRegistry.addRecipe(ItemStacks.bakedPotato, "fff", "fpf", "fff", 'f', ItemStacks.potato, 'p', ItemStacks.portableCooker);
        GameRegistry.addRecipe(ItemStacks.cookedFish, "fff", "fpf", "fff", 'f', ItemStacks.fish, 'p', ItemStacks.portableCooker);
        GameRegistry.addRecipe(ItemStacks.cookedChicken, "fff", "fpf", "fff", 'f', ItemStacks.chicken, 'p', ItemStacks.portableCooker);
        GameRegistry.addRecipe(ItemStacks.oysterMeat, "fff", "fpf", "fff", 'f', ItemStacks.oyster, 'p', ItemStacks.portableCooker);
    }

    public static void initLanguageRegistry() {
        LanguageRegistry.addName(pearlIgniter, "Pearl Igniter");
        LanguageRegistry.addName(pearlPortalPlacer, "Pearl Portal Placer");
        LanguageRegistry.addName(blackPearl, "Black Pearl");
        LanguageRegistry.addName(oyster, "Oyster");
        LanguageRegistry.addName(oysterMeat, "Oyster Meat");
        LanguageRegistry.addName(pearl, "Pearl");
        LanguageRegistry.addName(shell, "Shell");
        LanguageRegistry.addName(pearlDiamond, "Pearly Diamond");
        LanguageRegistry.addName(blackPearlDiamond, "Black Pearly Diamond");
        LanguageRegistry.addName(dustPearl, "Pearl Dust");
        LanguageRegistry.addName(dustBlackPearl, "Black Pearl Dust");
        LanguageRegistry.addName(dustIron, "Iron Dust");
        LanguageRegistry.addName(dustGold, "Gold Dust");
        LanguageRegistry.addName(mortar, "Mortar");
        LanguageRegistry.addName(pestle, "Pestle");
        LanguageRegistry.addName(dustStrange, "Strange Dust");
        LanguageRegistry.addName(magnificentPearl, "Magnificent Pearl (Hot Item)");
    }

}
