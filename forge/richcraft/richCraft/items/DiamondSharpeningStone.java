package richCraft.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import richCraft.RichCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DiamondSharpeningStone  extends Item {

	public DiamondSharpeningStone() {
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(10);
		this.setNoRepair();
		this.setCreativeTab(RichCraft.richCraftTab);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(RichCraft.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	
	
	
}