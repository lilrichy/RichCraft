package richCraft.items;

import richCraft.RichCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemShears;

public class Clipper extends ItemShears {

	public Clipper(ToolMaterial copperMaterial) {
		super();
	this.setCreativeTab(RichCraft.richCraftTab);
	this.setMaxStackSize(1);
	this.setMaxDamage(300);
	}
	        
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(RichCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	
	}

}