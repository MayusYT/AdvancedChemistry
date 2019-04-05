package mayus.advancedchemistry;


import mayus.advancedchemistry.blocks.ChemicalWorkbench.BlockChemicalWorkbench;
import mayus.advancedchemistry.items.compounds.ItemBakingSoda;
import mayus.advancedchemistry.items.acids.ItemCitricAcid;
import mayus.advancedchemistry.items.misc.ItemBrausePowder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    @GameRegistry.ObjectHolder(AdvancedChemistry.MODID + ":baking_soda")
    public static ItemBakingSoda itemBakingSoda;

    @GameRegistry.ObjectHolder(AdvancedChemistry.MODID + ":citric_acid")
    public static ItemCitricAcid itemCitricAcid;

    @GameRegistry.ObjectHolder(AdvancedChemistry.MODID + ":brause_powder")
    public static ItemBrausePowder itemBrausePowder;


    @SideOnly(Side.CLIENT)
    public static void initModels() {

    }

    public static void register(IForgeRegistry<Item> registry) {
        registry.register(new ItemBakingSoda());
        registry.register(new ItemCitricAcid());
        registry.register(new ItemBrausePowder());

        registry.register(new ItemBlock(ModBlocks.blockChemicalWorkbench).setRegistryName(BlockChemicalWorkbench.CHEMICAL_WORKBENCH));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBakingSoda, 0, new ModelResourceLocation(itemBakingSoda.getRegistryName(), "Inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemCitricAcid, 0, new ModelResourceLocation(itemCitricAcid.getRegistryName(), "Inventory"));
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(itemBrausePowder, 0, new ModelResourceLocation(itemBrausePowder.getRegistryName(), "Inventory"));
    }
}
