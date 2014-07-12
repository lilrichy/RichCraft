package richCraft.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import richCraft.tileentity.TileEntityCopperOven;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;

public class ContainerCopperOven extends Container {

	private TileEntityCopperOven copperOven;
	
	public int lastBurnTime;
	public int lastCurrentItemBurnTime;
	public int lastCookTime;
	

	public ContainerCopperOven(InventoryPlayer inventory, TileEntityCopperOven tileentity) {
		this.copperOven = tileentity;

		this.addSlotToContainer(new Slot(tileentity, 0, 56, 35));
		this.addSlotToContainer(new Slot(tileentity, 1, 8, 62));
		this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity, 2, 116, 35));
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(inventory, j + i*9 + 9, 8 + j*18, 84 + i*18));
			}
		}

		for(int i = 0; i < 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}
		
	}

	
	public void addCraftingtoCrafters(ICrafting icrafting) {
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.copperOven.cookTime);
		icrafting.sendProgressBarUpdate(this, 1, this.copperOven.burnTime);
		icrafting.sendProgressBarUpdate(this, 2, this.copperOven.currentItemsBurnTime);
		
		
	}
	
	
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for(int i = 0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			
			if(this.lastCookTime != this.copperOven.cookTime) {
			icrafting.sendProgressBarUpdate(this, 0, this.copperOven.cookTime);
		}
		
			if(this.lastBurnTime != this.copperOven.burnTime) {
			icrafting.sendProgressBarUpdate(this, 0, this.copperOven.burnTime);
		}
	
			if(this.lastCurrentItemBurnTime != this.copperOven.currentItemsBurnTime) {
			icrafting.sendProgressBarUpdate(this, 0, this.copperOven.currentItemsBurnTime);
		}
	}
		
	this.lastCookTime = this.copperOven.cookTime;
	this.lastBurnTime = this.copperOven.burnTime;
	this.lastCurrentItemBurnTime = this.copperOven.currentItemsBurnTime;
	
	}
	
	@SideOnly(Side.CLIENT)
	
	
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
		return true;
	}

}
