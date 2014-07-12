package richCraft.handles;

import richCraft.RichCraft;
import richCraft.container.ContainerCopperOven;
import richCraft.gui.GuiCopperOven;
import richCraft.tileentity.TileEntityCopperOven;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
		if(entity != null) {
			switch(ID) {
			case RichCraft.GuiIDCopperOven:
				if (entity instanceof TileEntityCopperOven){
					return new ContainerCopperOven(player.inventory, (TileEntityCopperOven) entity);
				}
			}
		}
			return null;
		}


	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
	TileEntity entity = world.getTileEntity(x, y, z);
	
	if(entity != null) {
		switch(ID) {
		case RichCraft.GuiIDCopperOven:
			if (entity instanceof TileEntityCopperOven){
				return new GuiCopperOven(player.inventory, (TileEntityCopperOven) entity);
			}
		}
	}
		return null;
	}

	
	
}
