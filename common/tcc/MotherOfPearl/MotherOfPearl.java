package tcc.MotherOfPearl;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import tcc.MotherOfPearl.armor.ModArmor;
import tcc.MotherOfPearl.blocks.ModBlocks;
import tcc.MotherOfPearl.dimension.Dimension;
import tcc.MotherOfPearl.enchantment.ModEnchantments;
import tcc.MotherOfPearl.items.ModItems;
import tcc.MotherOfPearl.proxy.CommonProxy;
import tcc.MotherOfPearl.tools.ModTools;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import darkevilmac.MotherOfPearl.events.Events;
import darkevilmac.MotherOfPearl.lib.Reference;
import darkevilmac.MotherOfPearl.misc.Crafting;
import darkevilmac.MotherOfPearl.misc.LanguageReg;
import darkevilmac.MotherOfPearl.misc.OreDict;
import darkevilmac.MotherOfPearl.utils.ChestFiller;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.version)
@NetworkMod(channels = { Reference.MOD_ID }, clientSideRequired = true, serverSideRequired = true)
public class MotherOfPearl {
    public static CreativeTabs tabMoP = new CreativeTabs("MoP") {
        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(ModItems.pearl, 1, 0);
        }
    };
    /*
    public static CreativeTabs tabMoP_WIP = new CreativeTabs("MoP_WIP") {

        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(ModBlocks.pearlstoneBrick, 1, 0);
        }
    };*/

    @SidedProxy(clientSide = Reference.PROXY_PATH + ".ClientProxy", serverSide = Reference.PROXY_PATH + ".CommonProxy")
    public static CommonProxy proxy;
    public static Configuration cfg;
    private static Configuration config;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        config = new Configuration(event.getSuggestedConfigurationFile());
        cfg = config;

        MOPConfiguration.init();
        ModBlocks.init();
        ModEnchantments.init();
        ModItems.init();
        ModTools.init();
        ModArmor.init();
        LanguageReg.init();
        Dimension.loadPort();

        /*
         * darkevilmac pointed me to the website http://www.minecraftforum.net/topic
         * /1578638-forge-how-to-edit-vanilla-block-properties/ to help me replace clayGen in the world.
         */
        //Block.blocksList[Block.blockClay.blockID] = ModBlocks.clayOyster;
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        Events.init();
        OreDict.init();
        ChestFiller.init();
        Crafting.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        

    }

}
