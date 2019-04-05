package mayus.advancedchemistry.misc;

import mayus.advancedchemistry.AdvancedChemistry;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = AdvancedChemistry.MODID)
public class Events {

    @SubscribeEvent
    static void applyCustomTooltips(ItemTooltipEvent itemTooltipEvent) {
        if(itemTooltipEvent.getItemStack().getItem() == Items.SUGAR) {
            itemTooltipEvent.getToolTip().add("C₁₂H₂₂O₁₁");
        }
    }
}
