package darkevilmac.MotherOfPearl.misc;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import tcc.MotherOfPearl.blocks.ModBlocks;
import tcc.MotherOfPearl.items.ModItems;

public class OreDict {

    public static void init() {

        OreDictionary.registerOre("dustGold", new ItemStack(ModItems.dustGold));
        OreDictionary.registerOre("dustIron", new ItemStack(ModItems.dustIron));
        //OreDictionary.registerOre("blockClay", new ItemStack(ModBlocks.classicClay));
        //OreDictionary.registerOre("blockClay", new ItemStack(ModBlocks.clayOyster));

    }
}
