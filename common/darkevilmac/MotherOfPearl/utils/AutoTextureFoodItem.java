package darkevilmac.MotherOfPearl.utils;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class AutoTextureFoodItem extends ItemFood {

    public AutoTextureFoodItem(int par1, int par2, boolean par3) {
        super(par1, par2, par3);
        // TODO Auto-generated constructor stub
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

}
