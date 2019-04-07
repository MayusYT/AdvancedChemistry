package mayus.advancedchemistry.blocks.ChemicalWorkbench;

import mayus.advancedchemistry.AdvancedChemistry;
import mayus.advancedchemistry.misc.IGuiTile;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

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

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        // Only execute on the server
        if (world.isRemote) {
            return true;
        }
        TileEntity te = world.getTileEntity(pos);
        if (!(te instanceof IGuiTile)) {
            return false;
        }
        if(!player.isSneaking()) {
            System.out.println("openGui");
            player.openGui(AdvancedChemistry.instance, 0, world, pos.getX(), pos.getY(), pos.getZ());
        } else {
            return false;
        }

        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileChemicalWorkbench();
    }


    // It really has to be the one with IBlockstate!
    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }
}
