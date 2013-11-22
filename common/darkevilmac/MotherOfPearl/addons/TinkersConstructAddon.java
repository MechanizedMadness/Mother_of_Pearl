package darkevilmac.MotherOfPearl.addons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tcc.MotherOfPearl.items.ItemToolPart;
import tcc.MotherOfPearl.items.ItemToolShard;
import tconstruct.library.TConstructRegistry;
import tconstruct.library.client.TConstructClientRegistry;
import tconstruct.library.crafting.PatternBuilder;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;

public class TinkersConstructAddon {
    
    public static Item pearlToolRod;
    public static Item pearlToolShard;

    public static final ItemStack pearlItemStack = new ItemStack(MOPConfiguration.pearlID, 1, 0);
    public static final ItemStack blackPearlItemStack = new ItemStack(MOPConfiguration.blackPearlID, 1, 0);

    public static void init() {

        initAddonBlocks();
        initAddonItems();

        PatternBuilder pb = PatternBuilder.instance;

        TConstructRegistry.addToolMaterial(/* Unique ID */70,/* Unique Name */"Pearl", 1, 250, 600, 1, 1.0F, 1, /* StoneBound */1F, "\u00A7f", "Stonebound");
        TConstructRegistry.addToolMaterial(/* Unique ID */71,/* Unique Name */"Iron Pearl", 2, 350, 775, 2, 1.35F, 2, /* StoneBound */1.5F, "\u00A7f", "Stonebound");
        TConstructRegistry.addToolMaterial(/* Unique ID */72,/* Unique Name */"Diamond Pearl", 3, 425, 875, 3, 1.5F, 2, /* StoneBound */1.75F, "\u00A7f", "Stonebound");
        TConstructRegistry.addToolMaterial(/* Unique ID */73,/* Unique Name */"Black Pearl", 2, 300, 650, 2, 1.15F, 1, /* StoneBound */1.5F, "\u00A7f", "Stonebound");
        TConstructRegistry.addToolMaterial(/* Unique ID */74,/* Unique Name */"Iron Black Pearl", 3, 400, 850, 3, 1.45F, 2, /* StoneBound */2F, "\u00A7f", "Stonebound");
        TConstructRegistry.addToolMaterial(/* Unique ID */75,/* Unique Name */"Diamond Black Pearl", 4, 475, 975, 4, 1.75F, 2, /* StoneBound */2.50F, "\u00A7f", "Stonebound");

        TConstructClientRegistry.addMaterialRenderMapping(70, "mop", "pearl", true);
        TConstructClientRegistry.addMaterialRenderMapping(71, "mop", "ironpearl", true);
        TConstructClientRegistry.addMaterialRenderMapping(72, "mop", "diamondpearl", true);
        TConstructClientRegistry.addMaterialRenderMapping(73, "mop", "blackpearl", true);
        TConstructClientRegistry.addMaterialRenderMapping(74, "mop", "ironblackpearl", true);
        TConstructClientRegistry.addMaterialRenderMapping(75, "mop", "diamondblackpearl", true);

    }

    private static void initAddonItems() {

        pearlToolRod = new ItemToolPart(MOPConfiguration.pearlRodID, "_rod").setUnlocalizedName("mop.ToolRod");
        pearlToolShard = new ItemToolShard(MOPConfiguration.pearlShardID, "_chunk").setUnlocalizedName("mop.ToolShard");

    }

    private static void initAddonBlocks() {

    }

}
