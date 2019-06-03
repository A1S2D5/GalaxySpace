package galaxyspace.systems.ACentauriSystem.core.registers.blocks;

import galaxyspace.core.prefab.items.GSItemBlockDesc;
import galaxyspace.systems.ACentauriSystem.planets.proxima_b.blocks.Proxima_B_Blocks;
import galaxyspace.systems.ACentauriSystem.planets.proxima_b.blocks.Proxima_B_Logs;
import galaxyspace.systems.ACentauriSystem.planets.proxima_b.items.ItemBlocksProxima_B;
import micdoodle8.mods.galacticraft.core.GCBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ACBlocks {
	
	public static final Block PROXIMA_B_BLOCKS = new Proxima_B_Blocks().setHardness(3.0F);
	public static final Block PROXINA_B_LOG_1 = new Proxima_B_Logs("proxima_b_log_1");
	public static final Block PROXINA_B_LOG_2 = new Proxima_B_Logs("proxima_b_log_2");
	
	public static void initialize() 
	{	
		registerBlock(PROXIMA_B_BLOCKS, ItemBlocksProxima_B.class);
		registerBlock(PROXINA_B_LOG_1, GSItemBlockDesc.class);
		registerBlock(PROXINA_B_LOG_2, GSItemBlockDesc.class);
	}
	
	public static void oreDictRegistration() 
	{
		
	}
	
	public static void registerBlock(Block block, Class<? extends ItemBlock> itemClass)
    {
        GCBlocks.registerBlock(block, itemClass);
    }
}
