package tcc.MotherOfPearl.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import tcc.MotherOfPearl.MotherOfPearl;
import darkevilmac.MotherOfPearl.lib.Reference;

public class BlockPearlCobbleStone extends Block {

    public BlockPearlCobbleStone(int par1, Material par2Material) {
        super(par1, par2Material);
        // TODO Auto-generated constructor stub
        this.setUnlocalizedName("pearlCobblestone");
        this.setHardness(1.0F);
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(MotherOfPearl.tabMoP);
    }

    @Override
    public void registerIcons(IconRegister reg) {
        blockIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

}