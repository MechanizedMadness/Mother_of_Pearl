package tcc.MotherOfPearl.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import tconstruct.items.CraftingItem;
import tconstruct.library.util.IToolPart;

public class ItemToolPart extends CraftingItem implements IToolPart {
    public ItemToolPart(int id, String textureType) {
        super(id, toolMaterialNames, buildTextureNames(textureType), "parts/");
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    private static String[] buildTextureNames(String textureType) {
        String[] names = new String[toolMaterialNames.length];
        for (int i = 0; i < toolMaterialNames.length; i++) {
            if (toolTextureNames[i].equals(""))
                names[i] = "";
            else
                names[i] = toolTextureNames[i] + textureType;
        }
        return names;
    }

    public static final String[] toolMaterialNames = new String[] { "Pearl", "Iron Pearl", "Diamond Pearl", "Black Pearl", "Iron Black Pearl", "Diamond Black Pearl", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

    public static final String[] toolTextureNames = new String[] { "pearl", "ironpearl", "diamondpearl", "blackpearl", "ironblackpearl", "diamondblackpearl", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };

    public void getSubItems(int id, CreativeTabs tab, List list) {
        for (int i = 0; i < 17; i++)
            list.add(new ItemStack(id, 1, i));
    }

    @Override
    public int getMaterialID(ItemStack stack) {
        return stack.getItemDamage();
    }
}
