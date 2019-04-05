package mayus.advancedchemistry.blocks.ChemicalWorkbench;

import mayus.advancedchemistry.AdvancedChemistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockChemicalWorkbench extends Block {

    public static final ResourceLocation CHEMICAL_WORKBENCH = new ResourceLocation(AdvancedChemistry.MODID, "chemical_workbench");

    public BlockChemicalWorkbench() {
        super(Material.IRON);
        setHardness(4f);
        setRegistryName(CHEMICAL_WORKBENCH);
        setTranslationKey("chemical_workbench");
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(AdvancedChemistry.creativeTab);
    }

    /**
     * Setting the ResourceLocation to the registry name (the ResourceLocation above)
     */
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
