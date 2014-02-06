package tcc.MotherOfPearl.dimension.world.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import tcc.MotherOfPearl.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenModOre implements IWorldGenerator {
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case 2:
                generateNether(world, random, chunkX * 16, chunkZ * 16, chunkProvider, chunkX, chunkZ);
            case 3:
                generatePearl(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
    	
    }

    private void generateNether(World world, Random random, int chunkX, int chunkZ, IChunkProvider par1IChunkProvider, int par2, int par3) {

    }

    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

    }

    private void generatePearl(World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 50; i++) {
            int xCoord = chunkX + random.nextInt(16);
            int yCoord = random.nextInt(128);
            int zCoord = chunkZ + random.nextInt(16);
            new WorldGenMinablePearl(ModBlocks.blackPearlstone.blockID, 15).generate(world, random, xCoord, yCoord, zCoord);
        }
        for (int i = 0; i < 50; i++) {
            int xCoord = chunkX + random.nextInt(16);
            int yCoord = random.nextInt(128);
            int zCoord = chunkZ + random.nextInt(16);
            new WorldGenMinablePearl(ModBlocks.pearlstone.blockID, 15).generate(world, random, xCoord, yCoord, zCoord);
        }
    }
}