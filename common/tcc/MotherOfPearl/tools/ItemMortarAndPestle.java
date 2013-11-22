package tcc.MotherOfPearl.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import tcc.MotherOfPearl.MotherOfPearl;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class ItemMortarAndPestle extends Item {

    public ItemMortarAndPestle(int par1) {
        super(par1);
        setMaxDamage(1000); // Sets the item's max damage
        setMaxStackSize(1);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setUnlocalizedName("mortarAndPestle");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return Item.diamond.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @SideOnly(Side.CLIENT)
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D() {
        return true;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

}
