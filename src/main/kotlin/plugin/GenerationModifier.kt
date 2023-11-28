package plugin

import org.bukkit.Material
import org.bukkit.World
import org.bukkit.generator.ChunkGenerator
import org.bukkit.generator.ChunkGenerator.ChunkData
import org.bukkit.generator.WorldInfo
import org.bukkit.util.noise.SimplexOctaveGenerator
import java.util.*



class GenerationModifier : ChunkGenerator() {


    override fun generateBedrock(worldInfo: WorldInfo, random: Random, chunkX: Int, chunkZ: Int, chunkData: ChunkData) {
        for (x in -64..319) {
            for (z in -64..319) {
                chunkData.setBlock(x, chunkData.minHeight, z, Material.AIR)
                }
            }
        }



    override fun generateSurface(worldInfo: WorldInfo, random: Random, chunkX: Int, chunkZ: Int, chunkData: ChunkData) {
        for(x in -64 .. 319) {
            for (z in -64..319){
                chunkData.setBlock(x, chunkData.minHeight, z, Material.AIR)

            }
        }
    }

    override fun shouldGenerateCaves(): Boolean {
        return false
    }

    override fun shouldGenerateMobs(): Boolean {
        return false
    }

    override fun shouldGenerateDecorations(): Boolean {
        return false
    }

    override fun shouldGenerateStructures(): Boolean {
        return true

    }

    override fun shouldGenerateNoise(): Boolean {
        return false
    }
}