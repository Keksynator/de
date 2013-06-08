package de.keksynator.MoreCobalt.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Block OreCobalt;

	public static void init() {
		
		OreCobalt = new BlockOreCobalt(3501);
		
		GameRegistry.registerBlock(OreCobalt, "orecobalt");
		
		LanguageRegistry.addName(OreCobalt, "Cobalt Ore");
		 
	 }
	
}
