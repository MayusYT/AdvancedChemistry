package mayus.advancedchemistry;


import mayus.advancedchemistry.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = AdvancedChemistry.MODID, name = AdvancedChemistry.MODNAME, version = AdvancedChemistry.MODVERSION, dependencies = "required-after:forge@[14.23.5.2768,)", useMetadata = true)
public class AdvancedChemistry {

    public static final String MODID = "advancedchemistry";
    public static final String MODNAME = "Advanced Rocketry";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "mayus.advancedchemistry.proxy.ClientProxy", serverSide = "mayus.advancedchemistry.proxy.ServerProxy")
    public static CommonProxy proxy;

    public static CreativeTabs creativeTab = new CreativeTabs("advancedchemistry") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.itemBakingSoda);
        }
    };



    @Mod.Instance
    public static AdvancedChemistry instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


    // COPY & PASTE SUB-/ SUPERSCRIPT
    //₀	subscript 0
    //₁	subscript 1
    //₂	subscript 2
    //₃	subscript 3
    //₄	subscript 4
    //₅	subscript 5
    //₆	subscript 6
    //₇	subscript 7
    //₈	subscript 8
    //₉	subscript 9
    ////////////
    //⁰	superscript 0
    //¹	superscript 1
    //²	superscript 2
    //³	superscript 3
    //⁴	superscript 4
    //⁵	superscript 5
    //⁶	superscript 6
    //⁷	superscript 7
    //⁸	superscript 8
    //⁹	superscript 9
}
