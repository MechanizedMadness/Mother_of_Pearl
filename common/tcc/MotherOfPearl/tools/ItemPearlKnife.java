package tcc.MotherOfPearl.tools;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tcc.MotherOfPearl.MotherOfPearl;
import tcc.MotherOfPearl.items.ModItems;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class ItemPearlKnife extends Item {

    private float weaponDamage;
    private final EnumToolMaterial toolMaterial;

    public ItemPearlKnife(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1);
        this.toolMaterial = par2EnumToolMaterial;
        setMaxDamage(30); // Sets the item's max damage
        setMaxStackSize(1);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setUnlocalizedName("knifePearl");
        this.weaponDamage = 4.0F + par2EnumToolMaterial.getDamageVsEntity();
    }

    public float func_82803_g() {
        return this.toolMaterial.getDamageVsEntity();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return ModItems.pearl.itemID == par2ItemStack.itemID ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
        if (par2Block.blockID == Block.web.blockID) {
            return 15.0F;
        } else {
            Material material = par2Block.blockMaterial;
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.pumpkin ? 1.0F : 1.5F;
        }
    }

    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6, EntityLivingBase par7EntityLivingBase) {
        if ((double) Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D) {
            par1ItemStack.damageItem(2, par7EntityLivingBase);
        }

        return true;
    }

    @SideOnly(Side.CLIENT)
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D() {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items
     * is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is
     * pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block) {
        return par1Block.blockID == Block.web.blockID;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based
     * on material.
     */
    public int getItemEnchantability() {
        return this.toolMaterial.getEnchantability();
    }

    /**
     * Return the name for this tool's material.
     */
    public String getToolMaterialName() {
        return this.toolMaterial.toString();
    }

    /**
     * Return whether this item is repairable in an anvil.
     */

    public Multimap func_111205_h() {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double) this.weaponDamage, 0));
        return multimap;
    }
}
