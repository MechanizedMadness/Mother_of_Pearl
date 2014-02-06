package tcc.MotherOfPearl.enchantment;

import darkevilmac.MotherOfPearl.Config.MOPConfiguration;
import net.minecraft.enchantment.Enchantment;


public class ModEnchantments {

	public static Enchantment nightvision;
	public static Enchantment angelwings;
	public static Enchantment jumping;
	public static Enchantment swiftness;
	
    public static void init() {
        defEnchantment();
        initGameRegistry();
        initLanguageRegistry();
    }

    public static void defEnchantment() {
    	nightvision = new EnchantmentHelm(MOPConfiguration.nightvisionID, 2);
    	angelwings = new EnchantmentChestplate(MOPConfiguration.angelwingsID, 2);
    	jumping = new EnchantmentLeggings(MOPConfiguration.jumpingID, 2);
    	swiftness = new EnchantmentBoots(MOPConfiguration.swiftnessID, 2);
    }

    public static void initGameRegistry() {

    }

    public static void initLanguageRegistry() {
    	
    }

}
