package tcc.MotherOfPearl.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemToolShard extends ItemToolPart {

    public ItemToolShard(int id, String tex) {
        super(id, tex);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    private static String[] buildTextureNames(String textureType) {
        String[] names = new String[toolMaterialNames.length];
        for (int i = 0; i < toolMaterialNames.length; i++)
            names[i] = toolTextureNames[i] + textureType;
        return names;
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this.icons = new Icon[textureNames.length];

        for (int i = 0; i < 5; ++i) {
            this.icons[i] = iconRegister.registerIcon("mop:" + folder + textureNames[i]);
        }
        icons[5] = icons[4];
        for (int i = 6; i < 9; ++i) {
            this.icons[i] = iconRegister.registerIcon("mop:" + folder + textureNames[i]);
        }
        icons[9] = icons[8];
        for (int i = 10; i < icons.length; ++i) {
            this.icons[i] = iconRegister.registerIcon("mop:" + folder + textureNames[i]);
        }
    }

    public void getSubItems(int id, CreativeTabs tab, List list) {
        for (int i = 1; i < 5; i++)
            list.add(new ItemStack(id, 1, i));
        for (int i = 6; i < 9; i++)
            list.add(new ItemStack(id, 1, i));
        for (int i = 10; i < 17; i++)
            list.add(new ItemStack(id, 1, i));
    }
}