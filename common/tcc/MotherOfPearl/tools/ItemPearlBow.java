package tcc.MotherOfPearl.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import tcc.MotherOfPearl.MotherOfPearl;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import darkevilmac.MotherOfPearl.lib.Reference;

public class ItemPearlBow extends ItemBow {

    @SideOnly(Side.CLIENT)
    private Icon icon0;
    private Icon icon1;
    private Icon icon2;

    public ItemPearlBow(int par1) {
        super(par1);
        maxStackSize = 1;
        // Lasts longer
        this.setMaxDamage(512);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setUnlocalizedName("bowPearl");
    }

    /**
     * called when the player releases the use item button. Args: itemstack,
     * world, entityplayer, itemInUseCount
     */
    @Override
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
        int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return;
        j = event.charge;

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID)) {
            float f = j / 20.0F;
            f = (f * f + f * 2.0F) / 3.0F;

            if (f < 0.1D)
                return;

            if (f > 1.0F) {
                f = 1.0F;
            }

            EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F);

            if (f == 1.0F) {
                entityarrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (k > 0) {
                entityarrow.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (l > 0) {
                entityarrow.setKnockbackStrength(l);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0) {
                entityarrow.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

            if (flag) {
                entityarrow.canBePickedUp = 2;
            } else {
                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
            }

            if (!par2World.isRemote) {
                par2World.spawnEntityInWorld(entityarrow);
            }
        }
    }

    @Override
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        return par1ItemStack;
    }

    /**
     * How long it takes to use or consume an item
     */
    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

    /**
     * returns the action that specifies what animation to play when the items
     * is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.bow;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is
     * pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return event.result;

        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID)) {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    /**
     * Return the enchantability factor of the item, most of the time is based
     * on material.
     */
    @Override
    public int getItemEnchantability() {
        return 10;
    }

    public String STANDBY = Reference.MOD_ID.toLowerCase() + ":bowPearl_standby";
    public String TEXTURE0 = Reference.MOD_ID.toLowerCase() + ":bowPearl_pulling_0";
    public String TEXTURE1 = Reference.MOD_ID.toLowerCase() + ":bowPearl_pulling_1";
    public String TEXTURE2 = Reference.MOD_ID.toLowerCase() + ":bowPearl_pulling_2";

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(STANDBY);
        icon0 = par1IconRegister.registerIcon(TEXTURE0);
        icon1 = par1IconRegister.registerIcon(TEXTURE1);
        icon2 = par1IconRegister.registerIcon(TEXTURE2);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining) {
        if (player.getItemInUse() == null)
            return this.itemIcon;
        int Pulling = stack.getMaxItemUseDuration() - useRemaining;
        if (Pulling >= 18) {
            return icon2;
        } else if (Pulling > 13) {
            return icon1;
        } else if (Pulling > 0) {
            return icon0;
        }
        return itemIcon;
    }
}