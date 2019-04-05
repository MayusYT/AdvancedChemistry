package mayus.advancedchemistry.items;

import mayus.advancedchemistry.AdvancedChemistry;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSubstance extends Item {

    public ItemSubstance() {
        maxStackSize = 16;
        setCreativeTab(AdvancedChemistry.creativeTab);
    }

    protected String altName;

    protected String formula;

    protected String molarMass;

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(altName);
        tooltip.add(formula);
        tooltip.add(molarMass + "g/mol");
    }

}
