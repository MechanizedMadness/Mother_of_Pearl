package tcc.MotherOfPearl.blocks;

import java.util.Random;

import org.apache.commons.lang3.SystemUtils;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class BlockPearlFire extends Block {
    @SideOnly(Side.CLIENT)
    private Icon[] iconArray;

    public BlockPearlFire(int par1) {
        super(par1, Material.air);
        setUnlocalizedName("pearlFire");
    }

    public Icon getIcon(int par1, int par2) {
        return this.blockIcon;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
        return null;
    }
   
    public int getRenderBlockPass()
    {
        return 4;
    }
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }

    public int quantityDropped(Random par1Random) {
        return 0;
    }

    public boolean func_82506_l() {
        return true;
    }

    public boolean isCollidable() {
        return false;
    }

    public void onBlockAdded(World par1World, int par2, int par3, int par4) {
        /** Change these to your portal frame and Portal block **/
        if ((par1World.getBlockId(par2, par3 - 1, par4) != ModBlocks.pearlstone.blockID) || (!ModBlocks.pearlPortal.tryToCreatePortal(par1World, par2, par3, par4))) {
            if ((!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4))) {
                par1World.setBlockToAir(par2, par3, par4);
            } else {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, tickRate(par1World) + par1World.rand.nextInt(10));
            }
        }
    }


    /** registers Icons, set textures here **/
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + "Pearlfire_0");
        this.iconArray = new Icon[] { par1IconRegister.registerIcon(Reference.MOD_ID + ":" + "Pearlfire_0"), par1IconRegister.registerIcon(Reference.MOD_ID + ":" + "Pearlfire_1") };
    }

    @SideOnly(Side.CLIENT)
    public Icon func_94438_c(int par1) {
        return this.iconArray[par1];
    }

    @SideOnly(Side.CLIENT)
    public Icon getBlockTextureFromSideAndMetadata(int par1, int par2) {
        return this.iconArray[0];
    }
}