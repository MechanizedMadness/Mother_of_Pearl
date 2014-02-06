package darkevilmac.MotherOfPearl.events;

import net.minecraftforge.common.MinecraftForge;

public class Events {
    public static void init() {
        MinecraftForge.EVENT_BUS.register(new ClayBreakHandler());
        MinecraftForge.EVENT_BUS.register(new SquidKillHandler());
        MinecraftForge.EVENT_BUS.register(new ArmorEventHandler());
        
    }
}
