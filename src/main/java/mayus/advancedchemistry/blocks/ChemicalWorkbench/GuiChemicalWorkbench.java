package mayus.advancedchemistry.blocks.ChemicalWorkbench;

import mayus.advancedchemistry.AdvancedChemistry;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiChemicalWorkbench extends GuiContainer {

    public static final int WIDTH = 175;
    public static final int HEIGHT = 165;

    private TileChemicalWorkbench te;

    private ContainerChemicalWorkbench container;

    private static final ResourceLocation GUI = new ResourceLocation(AdvancedChemistry.MODID, "textures/gui/chemical_workbench.png");


    public GuiChemicalWorkbench(TileChemicalWorkbench te, ContainerChemicalWorkbench container) {
        super(container);
        System.out.println("gui");
        this.container = container;
        xSize = WIDTH;
        ySize = HEIGHT;

        this.te = te;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        mc.getTextureManager().bindTexture(GUI);

        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        //Render the dark background
        drawDefaultBackground();

        super.drawScreen(mouseX, mouseY, partialTicks);

        //Render any tooltips
        renderHoveredToolTip(mouseX, mouseY);
    }


}
