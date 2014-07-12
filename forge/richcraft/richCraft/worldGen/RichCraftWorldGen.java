package richCraft.worldGen;

import java.util.Random;

import richCraft.RichCraft;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class RichCraftWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			// Main World Gen
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case -1:
			// Nether World Gen
			generateNether(world, random, chunkX * 16, chunkZ * 16);

		case 1:
			// The End World Gen
			generateTheEnd(world, random, chunkX * 16, chunkZ * 16);

		}

	}
	// this.addOreSpawn(RichCraft.ORE to Spawn, WORLD, random, x=blockXPos, z=blockZPos, maxX, maxZ, MaxVeinSize, ChanceTfSpwan, minY, maxY)
	private void generateSurface(World world, Random random, int x, int z) {
		this.addOreSpawn(RichCraft.oreCopperOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 25, 40, 100);
		
	}


	private void generateNether(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void generateTheEnd(World world, Random random, int i, int j) {
		// TODO Auto-generated method stub

	}
	
	

	private void addOreSpawn(Block block, World world, Random random, int blockXPos,
		int blockZPos, int maxX, int maxZ, int MaxVeinSize, int ChanceToSpawn, int minY, int maxY) {
	for(int i = 0; i < ChanceToSpawn; i++) {
		int posX = blockXPos + random.nextInt(maxX);
		int posY = minY + random.nextInt(maxY - minY);
		int posZ = blockZPos + random.nextInt(maxZ);
		(new WorldGenMinable(block, MaxVeinSize)).generate(world, random, posX, posY, posZ);
	}
	}
}
