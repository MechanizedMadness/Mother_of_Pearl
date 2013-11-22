package tcc.MotherOfPearl.dimension;

import net.minecraftforge.common.DimensionManager;
import tcc.MotherOfPearl.dimension.world.WorldProviderPearl;
import tcc.MotherOfPearl.dimension.world.gen.WorldGenModOre;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import darkevilmac.MotherOfPearl.lib.Reference;

public class Dimension {

    public static int DimID = Reference.DIMID_1;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void loadPort() {
        /** Register WorldProvider for Dimension **/
        DimensionManager.registerProviderType(DimID, WorldProviderPearl.class, true);
        DimensionManager.registerDimension(DimID, DimID);

        /** Ore Generator **/
        GameRegistry.registerWorldGenerator(new WorldGenModOre());
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }

}
