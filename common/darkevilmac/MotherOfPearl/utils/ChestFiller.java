package darkevilmac.MotherOfPearl.utils;

import tcc.MotherOfPearl.armor.ModArmor;
import tcc.MotherOfPearl.items.ModItems;
import tcc.MotherOfPearl.tools.ModTools;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ChestFiller {

    public static void init() {
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModItems.pearlDiamond),
                1,5,005));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.helmetPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.chestplatePearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.leggingsPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.bootsPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.helmetBlackPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.chestplateBlackPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.leggingsBlackPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.bootsBlackPearl),
                1,1,045));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.helmetPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.chestplatePearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.leggingsPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.bootsPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.helmetBlackPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.chestplateBlackPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.leggingsBlackPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModArmor.bootsBlackPearlDiamond),
                1,1,005));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModTools.mortarAndPestle),
                1,1,035));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModTools.shovelPearl),
                1,1,075));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModTools.shovelBlackPearl),
                1,1,075));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModTools.swordPearl),
                1,1,075));
        ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModTools.swordBlackPearl),
                1,1,075));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModItems.pearlDiamond),
                1,10,005));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModItems.blackPearlDiamond),
                1,10,005));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModTools.bowPearl),
                1,1,025));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModItems.pearlDiamond),
                1,10,005));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST)
        .addItem(new WeightedRandomChestContent(new ItemStack(ModItems.blackPearlDiamond),
                1,10,005));
    }

}
