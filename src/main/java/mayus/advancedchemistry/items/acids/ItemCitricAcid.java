package mayus.advancedchemistry.items.acids;

import mayus.advancedchemistry.AdvancedChemistry;
import mayus.advancedchemistry.items.ItemSubstance;
import net.minecraft.util.ResourceLocation;

public class ItemCitricAcid extends ItemSubstance {

    public static final ResourceLocation BAKING_SODA = new ResourceLocation(AdvancedChemistry.MODID, "citric_acid");

    public ItemCitricAcid() {
        formula = "C₆H₈O₇";
        molarMass = "192.123";
        setTranslationKey("citric_acid");
        setRegistryName(BAKING_SODA);
    }
}
