package de.keksynator.MoreCobalt.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;

public class ModBlocks {
	
	public static Boolean BORloadedS;
	
	public static Block OreCobalt;

	public static void init() {
		
		OreCobalt = new BlockOreCobalt(3501);
		
		GameRegistry.registerBlock(OreCobalt, "orecobalt");
		
		LanguageRegistry.addName(OreCobalt, "Cobalt Ore");
		
		BlockOreCobaltLoadedSucessful();
		
	 }
	
	public static void BlockOreCobaltLoadedSucessful(){
		if(BlockOreCobalt.LoadedSucessful()) {
			System.out.println("[MoreCobalt] Block Ore Cobalt loaded Sucessful!");
			BORloadedS = true;
		}else{
			System.out.println("[MoreCobalt] Block Ore Cobalt load Failed!");
			BORloadedS = false;
			
		}
	}
	
	public static boolean initSucessful(){
		return true;
	}
	
}
