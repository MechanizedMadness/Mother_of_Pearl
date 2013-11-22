package tcc.MotherOfPearl.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockClassicClay extends Block {

    public BlockClassicClay(int par1, Material par2Material) {
        super(par1, par2Material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(0.6F);
        this.setStepSound(Block.blockClay.stepSound);
        this.setUnlocalizedName("classicClay");
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return Item.clay.itemID;
    }

    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon("minecraft:clay");
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random) {
        return 4;
    }

}
