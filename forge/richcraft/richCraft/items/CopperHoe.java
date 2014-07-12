package richCraft.items;

import richCraft.RichCraft;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class CopperHoe extends ItemHoe{

	public CopperHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
				this.setCreativeTab(RichCraft.richCraftTab);
				
				
			}

			@SideOnly(Side.CLIENT)
			public void registerIcons(IIconRegister iconRegister) {
				this.itemIcon = iconRegister.registerIcon(RichCraft.modid + ":" + this.getUnlocalizedName().substring(5));
			}
			
		}
