package plugin

import org.bukkit.Material
import org.bukkit.World
import org.bukkit.generator.ChunkGenerator
import org.bukkit.generator.ChunkGenerator.ChunkData
import org.bukkit.generator.WorldInfo
import org.bukkit.util.noise.SimplexOctaveGenerator
import java.util.*



class GenerationModifier : ChunkGenerator() {
    /*override fun generateNoise(worldInfo: WorldInfo, random: Random, chunkX: Int, chunkZ: Int, chunkData: ChunkData) {
        val generator = SimplexOctaveGenerator(Random(worldInfo.seed), 6)
        generator.setScale(0.008)
        val material: Material
        material = if (worldInfo.environment == World.Environment.NORMAL) {
            Material.AIR
        } else {
            Material.AIR
        }
        val worldX = chunkX * 16
        val worldZ = chunkZ * 16
        for (x in -64..319) {
            for (z in -64..319) {
                val noise = generator.noise((worldX + x).toDouble(), (worldZ + z).toDouble(), 1.0, 1.0, true)
                var height = (noise * 40).toInt()
                height += 84
                if (height > chunkData.maxHeight) {
                    height = chunkData.maxHeight
                }
                for (y in 0 until height) {
                    chunkData.setBlock(x, y, z, material)
                }
            }
        }
    }*/

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