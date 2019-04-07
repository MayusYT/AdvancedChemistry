package mayus.advancedchemistry.blocks.ChemicalWorkbench;

import mayus.advancedchemistry.misc.IGuiTile;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.CombinedInvWrapper;

import javax.annotation.Nonnull;

public class TileChemicalWorkbench extends TileEntity implements IGuiTile {



    @Override
    public Container createContainer(EntityPlayer player) {
        System.out.println("createContainer");
        return new ContainerChemicalWorkbench(player.inventory, this);
    }

    @Override
    public GuiContainer createGui(EntityPlayer player) {
        System.out.println("createGUI");
        return new GuiChemicalWorkbench(this, new ContainerChemicalWorkbench(player.inventory, this));
    }

    /**
     * If we are too far away from this tile entity you cannot use it
     */
    public boolean canInteractWith(EntityPlayer playerIn) {
        return !isInvalid() && playerIn.getDistanceSq(pos.add(0.5D, 0.5D, 0.5D)) <= 64D;
    }

    /**
     * Handler for the Input Slots
     */
    public ItemStackHandler inputHandler = new ItemStackHandler(3) {

        @Override
        public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
            return true;
        }

        @Override
        protected void onContentsChanged(int slot) {
            TileChemicalWorkbench.this.markDirty();
        }
    };

    /**
     * Handler for the Output Slots
     */
    private ItemStackHandler outputHandler = new ItemStackHandler(3) {
        @Override
        protected void onContentsChanged(int slot) {
            TileChemicalWorkbench.this.markDirty();
        }
    };

    private CombinedInvWrapper combinedHandler = new CombinedInvWrapper(inputHandler, outputHandler);

}
