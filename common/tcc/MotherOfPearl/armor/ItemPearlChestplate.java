package tcc.MotherOfPearl.armor;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import tcc.MotherOfPearl.MotherOfPearl;
import tcc.MotherOfPearl.items.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class ItemPearlChestplate extends ItemArmor {

    public ItemPearlChestplate(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type) {
        super(par1, par2EnumArmorMaterial, par3, par4);
        // TODO Auto-generated constructor stub
        this.setMaxStackSize(1);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setUnlocalizedName("chestplatePearl");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {
        itemIcon = reg.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));

    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
        return Reference.MOD_ID.toLowerCase() + ":" + "pearl_1.png";
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return ModItems.pearl.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }
}