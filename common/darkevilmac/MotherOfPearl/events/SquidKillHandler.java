package darkevilmac.MotherOfPearl.events;

import java.util.Random;

import darkevilmac.MotherOfPearl.utils.Utilities;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import tcc.MotherOfPearl.items.ModItems;

public class SquidKillHandler {

    @ForgeSubscribe
    public void onSquidKill(LivingDropsEvent event) {
        if (event.source != null) {
            if (event.entityLiving.getClass() == EntitySquid.class) {
                event.entityLiving.dropItem(ModItems.oyster.itemID, Utilities.getRandom(1, 2));
            }
        }
    }
}
