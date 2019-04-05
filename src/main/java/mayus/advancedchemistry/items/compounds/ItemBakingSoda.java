package mayus.advancedchemistry.items.compounds;

import mayus.advancedchemistry.AdvancedChemistry;
import mayus.advancedchemistry.items.ItemSubstance;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class ItemBakingSoda extends ItemSubstance {

    public static final ResourceLocation BAKING_SODA = new ResourceLocation(AdvancedChemistry.MODID, "baking_soda");

    public ItemBakingSoda() {
        altName = I18n.format("item.tooltip.baking_soda.alt");
        formula = "NaHCO₃";
        molarMass = "84.007";
        setTranslationKey("baking_soda");
        setRegistryName(BAKING_SODA);
    }
}
