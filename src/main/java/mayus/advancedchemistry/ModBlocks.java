package mayus.advancedchemistry;


import mayus.advancedchemistry.blocks.ChemicalWorkbench.BlockChemicalWorkbench;

import mayus.advancedchemistry.blocks.ChemicalWorkbench.TileChemicalWorkbench;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    @GameRegistry.ObjectHolder(AdvancedChemistry.MODID + ":chemical_workbench")
    public static BlockChemicalWorkbench blockChemicalWorkbench;


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockChemicalWorkbench.initModel();

    }

    public static void register(IForgeRegistry<Block> registry) {
        registry.register(new BlockChemicalWorkbench());
        GameRegistry.registerTileEntity(TileChemicalWorkbench.class, BlockChemicalWorkbench.CHEMICAL_WORKBENCH);

    }


}
