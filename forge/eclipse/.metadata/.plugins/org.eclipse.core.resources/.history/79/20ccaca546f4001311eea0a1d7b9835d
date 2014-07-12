package richCraft;

import richCraft.blocks.CopperBlock;
import richCraft.blocks.CopperOre;
import richCraft.items.RCItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = RichCraft.modid, version = RichCraft.version)

public class RichCraft {
	public static final String modid = "RichCraft";
	public static final String version = "Dev 0.0.1";
	
	//Creative tab
	public static CreativeTabs richCraftTab;
	
//------------Variables---------------------------------------------------------------------------------------
	//Item variables
	public static Item itemCopperIngot;
	
	
	
	//Block variables
	public static Block oreCopperOre;
	public static Block blockCopperBlock;
	
	
	

	
//end of variables

		
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){
		//Creative Tab Registering
		richCraftTab = new CreativeTabs("richCraft") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem() {
				return Item.getItemFromBlock(oreCopperOre);
			}
		};
		
//------------Registers-----------------------------------------------------------------------------------------
		
		
		
		//Item Registering
		itemCopperIngot = new RCItems().setUnlocalizedName("CopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
		
		
		//Block Registering
		oreCopperOre = new CopperOre(Material.rock).setBlockName("CopperOre");
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		
		blockCopperBlock = new CopperBlock(Material.iron).setBlockName("CopperBlock");
		GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");
		
		
//end of registers
	}
	
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		
		
		//Smelter Recipes
		GameRegistry.addSmelting(oreCopperOre, new ItemStack(itemCopperIngot), 0);
		
		
		//Crafting Recipes
		GameRegistry.addRecipe(new ItemStack(blockCopperBlock), "iii", "iii", "iii", 'i', (itemCopperIngot));
		
		
		//Shapeless Crafting Recipes
		
		
		
		
	}
	
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
	
	

}
