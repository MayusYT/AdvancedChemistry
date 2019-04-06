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

    //Creation of a constant for saving texture path and ingame name
    public static final ResourceLocation CHEMICAL_WORKBENCH = new ResourceLocation(AdvancedChemistry.MODID, "chemical_workbench");


    public BlockChemicalWorkbench() {
        super(Material.IRON);
        setTranslationKey("chemical_workbench");
        setRegistryName(CHEMICAL_WORKBENCH);
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(AdvancedChemistry.creativeTab);
        setHardness(5.0F);
    }

    /**
     * Setting the ResourceLocation to the registry name (the ResourceLocation above)
     */
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
