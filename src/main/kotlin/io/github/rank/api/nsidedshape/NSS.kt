package io.github.rank.api.nsidedshape

import io.github.rank.api.nsideshape.Loc
import org.bukkit.Location
import kotlin.math.cos
import kotlin.math.sin

object NSS {
    // Get Minecraft N Sided Shape Location List
    fun getNSSMCLocationList(middle: Location, radius: Double, n: Int): List<Location> {
        val locationList = mutableListOf<Location>()
        val angle: Double = 360.0 / n
        for (i in 0 until n) {
            val t = angle * i
            val x = cos(t) * radius
            val z = sin(t) * radius

            locationList.add(middle.clone().add(x, 0.0, z))
        }

        return locationList
    }

    // Get N Sided Shape Location List
    fun getNSSLocationList(middle: Loc, radius: Double, n: Int): List<Loc> {
        val locationList = mutableListOf<Loc>()
        val angle: Double =  360.0 / n
        for (i in 0 until n) {
            val t = angle * i
            val x = cos(t) * radius
            val z = sin(t) * radius

            locationList.add(middle)
        }

        return locationList
    }
}