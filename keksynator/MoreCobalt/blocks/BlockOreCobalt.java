package de.keksynator.MoreCobalt.blocks;

import de.keksynator.MoreCobalt.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockOreCobalt extends Block {

	public BlockOreCobalt(int id) {
		super(id, Material.rock);
		this.setUnlocalizedName("orecobalt");
		
	}
	
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + (this.getUnlocalizedName().substring(5)));
    }
	
}
