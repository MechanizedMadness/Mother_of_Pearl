package tcc.MotherOfPearl.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import tcc.MotherOfPearl.MotherOfPearl;
import tcc.MotherOfPearl.items.ModItems;

public class BlockOysterClay extends Block {

    public BlockOysterClay(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setUnlocalizedName("clayOyster");
        this.setHardness(0.5F);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setStepSound(Block.blockClay.stepSound);
    }

    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon("minecraft:clay");
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */

    /*
     * The website
     * http://www.minecraftforum.net/topic/1329625-help-making-a-block
     * -drop-different-items-based-on-chance/ to help me with random chance at
     * dropping clay or oysters.
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        int quickvar = par2Random.nextInt(12) + 1;
        if (quickvar <= 1)
            return ModItems.oyster.itemID;
        else
            return Item.clay.itemID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random) {
        return 4;
    }

}