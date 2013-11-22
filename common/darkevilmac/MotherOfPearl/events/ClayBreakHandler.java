package darkevilmac.MotherOfPearl.events;

import java.util.ArrayList;

import net.minecraft.block.BlockClay;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import tcc.MotherOfPearl.items.ModItems;

public class ClayBreakHandler {

    @ForgeSubscribe
    public void onBlockBreak(HarvestDropsEvent oEvent) {
    
        if (!oEvent.world.isRemote) {
            if (oEvent.block instanceof BlockClay) {
                GenerateLootList(oEvent.drops,
                        Item.clay.itemID,
                        ModItems.oyster.itemID,
                        ModItems.oyster.itemID,
                        oEvent.fortuneLevel,
                        oEvent.world);
                oEvent.dropChance = 1.0F;
                return;
            }
        }
    }
    private void GenerateLootList(ArrayList<ItemStack> oList, int cItemID, int oItemID, int foItemID, int flevel, World world)
    {
        int oChance = world.rand.nextInt(4);
        int cCount = world.rand.nextInt(3)+1;
        int oCount = 4 - cCount;
        int foCount = 0;
        if(flevel > 0)
                foCount = world.rand.nextInt(flevel);
        oList.clear();
        if(oChance == 0){
            for(int i = 0; i < cCount; ++i)
            {
                ItemStack cdrop = new ItemStack(cItemID, 1, 0);
                oList.add(cdrop);
            }
            for(int i = 0; i < oCount; ++i)
            {
                ItemStack odrop = new ItemStack(oItemID, 1, 0);
                oList.add(odrop);
            }
        }
        if(oChance > 0){
            for(int i = 0; i < 4; ++i)
            {
                ItemStack cdrop = new ItemStack(cItemID, 1, 0);
                oList.add(cdrop);
            }
        }
        for(int i = 0; i < foCount; ++i)
        {
            ItemStack fodrop = new ItemStack(foItemID, 1, 0);
            oList.add(fodrop);
        }
        
        
    }

}