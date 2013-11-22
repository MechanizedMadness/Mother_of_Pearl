package tcc.MotherOfPearl.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import tcc.MotherOfPearl.MotherOfPearl;
import tcc.MotherOfPearl.items.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class ItemBlackPearlShovel extends ItemTool {

    public ItemBlackPearlShovel(int par1) {
        super(par1, 0F, ModTools.pearlShovel, ItemSpade.blocksEffectiveAgainst);
        maxStackSize = 1;
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setUnlocalizedName("shovelBlackPearl");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return ModItems.blackPearl.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
