package richCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import richCraft.RichCraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class SharpeningStone extends Item {

	public SharpeningStone() {
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(5);
		this.setNoRepair();
		this.setCreativeTab(RichCraft.richCraftTab);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(RichCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	
	
	
}
