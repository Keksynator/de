package de.keksynator.MoreCobalt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;
import de.keksynator.MoreCobalt.blocks.ModBlocks;
import de.keksynator.MoreCobalt.items.ModItems;
import de.keksynator.MoreCobalt.lib.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MoreCobalt {

	//Creative Tab
	 public static CreativeTabs tabMoreCobalt = new CreativeTabs("tabMoreCobalt")
	 {
	 public ItemStack getIconItemStack()
	 {
	 return new ItemStack(Item.stick, 1, 0);
	 }
	 };
	
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		
	}
	
	@Init
	public void init(FMLInitializationEvent event) {

		ModBlocks.init();
		ModItems.init();
		
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabMoreCobalt", "en_US", "More Cobalt");
	
		BlockInitSucessful();
		ItemInitSucessful();
		BeSafeAllLoaded();
		
	}
	
	public void BlockInitSucessful(){
		if(ModBlocks.initSucessful()){
			System.out.println("[MoreCobalt] Block Init Sucessful!");
		}
		else{
			System.out.println("[MoreCobalt] Block Init Failed!");
		}
	}
	
	public void ItemInitSucessful(){
		if(ModItems.initSucessful()){
			System.out.println("[MoreCobalt] Item Init Sucessful!");
		}
		else{
			System.out.println("[MoreCobalt] Item Init Failed!");
		}
	}
	
	public void BeSafeAllLoaded(){
		while(ModBlocks.BORloadedS == false){
			System.out.println("[MoreCobalt] Block Ore Cobalt FAILED!!!");
		}
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {

	}
}
