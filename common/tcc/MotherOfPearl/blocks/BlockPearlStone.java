package tcc.MotherOfPearl.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import tcc.MotherOfPearl.MotherOfPearl;
import darkevilmac.MotherOfPearl.lib.Reference;

public class BlockPearlStone extends Block {

    public BlockPearlStone(int par1, Material par2Material) {
        super(par1, par2Material);
        // TODO Auto-generated constructor stub
        this.setUnlocalizedName("pearlstone");
        this.setHardness(1.0F);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setResistance(20.0F);
    }
    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return ModBlocks.pearlCobblestone.blockID;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    @Override
    public int quantityDropped(Random par1Random) {
        return 1;
    }
}