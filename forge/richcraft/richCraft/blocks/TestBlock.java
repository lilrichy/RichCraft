package richCraft.blocks;

import richCraft.RichCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class TestBlock extends Block{

	public TestBlock(Material material) {
		super(material);

		this.setHardness(3.0F);
		this.setResistance(5.0F);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(RichCraft.richCraftTab);
		
	}

	
	
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(RichCraft.modid + ":" + this.getUnlocalizedName().substring(5));
		
	
		
	}
	
}
