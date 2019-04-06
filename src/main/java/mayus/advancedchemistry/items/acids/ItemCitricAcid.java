package mayus.advancedchemistry.items.acids;

import mayus.advancedchemistry.AdvancedChemistry;
import mayus.advancedchemistry.items.ItemSubstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class ItemCitricAcid extends ItemSubstance {

    public static final ResourceLocation BAKING_SODA = new ResourceLocation(AdvancedChemistry.MODID, "citric_acid");

    public ItemCitricAcid() {
        setFormula("C₆H₈O₇");
        setMolarMass("192.123");
        setTranslationKey("citric_acid");
        setRegistryName(BAKING_SODA);
    }
}
