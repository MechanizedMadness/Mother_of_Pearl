package tcc.MotherOfPearl.items;

import tcc.MotherOfPearl.MotherOfPearl;
import darkevilmac.MotherOfPearl.utils.AutoTextureFoodItem;

public class ItemOysterMeat extends AutoTextureFoodItem {

    public ItemOysterMeat(int par1, boolean alwaysEdible, int saturationModifier) {
        super(par1, saturationModifier, alwaysEdible);
        // TODO Auto-generated constructor stub
        this.setMaxStackSize(64);
        this.setCreativeTab(MotherOfPearl.tabMoP);
        this.setUnlocalizedName("oysterMeat");
    }

}
