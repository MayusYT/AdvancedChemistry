package mayus.advancedchemistry.items;

import mayus.advancedchemistry.AdvancedChemistry;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.xml.soap.Text;
import java.util.List;

public class ItemSubstance extends Item {

    public ItemSubstance() {
        maxStackSize = 16;
        setCreativeTab(AdvancedChemistry.creativeTab);
    }

    public String getAltName() {
        return altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getMolarMass() {
        return molarMass;
    }

    public void setMolarMass(String molarMass) {
        this.molarMass = molarMass;
    }

    private String altName = "";

    private String formula = "";

    private String molarMass = "";

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(!altName.equals("")) {
            tooltip.add("" + TextFormatting.BLUE + TextFormatting.ITALIC  + altName);
        }
        if(!formula.equals("")) {
            tooltip.add(TextFormatting.DARK_GRAY + formula);
        }
        if(!molarMass.equals("")) {
            tooltip.add(TextFormatting.DARK_GRAY + molarMass + "g/mol");
        }
    }
}
