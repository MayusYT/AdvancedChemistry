package mayus.advancedchemistry.items.misc;

import mayus.advancedchemistry.AdvancedChemistry;
import mayus.advancedchemistry.items.ItemSubstance;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class ItemBrausePowder extends ItemSubstance {

    public static final ResourceLocation BRAUSE = new ResourceLocation(AdvancedChemistry.MODID, "brause_powder");

    public ItemBrausePowder() {
        altName = I18n.format("item.tooltip.brause_powder.alt");
        setTranslationKey("brause_powder");
        setRegistryName(BRAUSE);
    }

}
