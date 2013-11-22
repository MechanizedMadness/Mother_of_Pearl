package darkevilmac.MotherOfPearl.misc;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import tcc.MotherOfPearl.armor.ModArmor;
import tcc.MotherOfPearl.blocks.ModBlocks;
import tcc.MotherOfPearl.items.ModItems;
import tcc.MotherOfPearl.tools.ModTools;
import cpw.mods.fml.common.registry.GameRegistry;
import darkevilmac.MotherOfPearl.lib.ItemStacks;

public class Crafting {

    public static void init() {
        GameRegistry.registerCraftingHandler(new CraftingHandler());
        //Crafting.RemoveRecipe(ItemStacks.clayBlock);
        //GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.classicClay, 1), "yy", "yy", 'y', ItemStacks.clayItem);
        ModArmor.initCrafting();
        ModBlocks.initCrafting();
        ModItems.initCrafting();
        ModTools.initCrafting();
    }

    protected static void RemoveRecipe(ItemStack resultItem) {
        ItemStack recipeResult = null;
        ArrayList recipes = (ArrayList) CraftingManager.getInstance().getRecipeList();
        for (int scan = 0; scan < recipes.size(); scan++) {
            IRecipe tmpRecipe = (IRecipe) recipes.get(scan);
            if (tmpRecipe instanceof ShapedRecipes) {
                ShapedRecipes recipe = (ShapedRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (tmpRecipe instanceof ShapelessRecipes) {
                ShapelessRecipes recipe = (ShapelessRecipes) tmpRecipe;
                recipeResult = recipe.getRecipeOutput();
            }
            if (ItemStack.areItemStacksEqual(resultItem, recipeResult)) {
                System.out.println("[MOP] Removed Recipe: " + recipes.get(scan) + " -> " + recipeResult);
                recipes.remove(scan);
            }
        }
    }
}
