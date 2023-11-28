package plugin

import com.google.common.collect.Lists
import org.bukkit.block.Biome
import org.bukkit.generator.BiomeProvider
import org.bukkit.generator.WorldInfo
import org.bukkit.util.noise.SimplexOctaveGenerator
import java.util.*

class BiomeModifier : BiomeProvider() {
    override fun getBiome(worldInfo: WorldInfo, x: Int, y: Int, z: Int): Biome {
        val generator = SimplexOctaveGenerator(Random(worldInfo.seed), 6)
        generator.setScale(0.01)
        return if (generator.noise(x.toDouble(), z.toDouble(), 1.0, 1.0, true) < 0) {
            Biome.OCEAN
        } else {
            Biome.OCEAN
        }
    }

    override fun getBiomes(worldInfo: WorldInfo): List<Biome> {
        return Lists.newArrayList<Biome>(Biome.OCEAN)

    }
}