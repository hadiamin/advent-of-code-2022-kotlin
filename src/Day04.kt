import kotlin.reflect.typeOf

fun main() {
    fun String.asIntRange() = substringBefore("-").toInt() .. substringAfter("-").toInt()

    fun String.asRanges() = substringBefore(",").asIntRange() to substringAfter(",").asIntRange()

    infix fun IntRange.overlaps(other: IntRange): Boolean = first <= other.last && other.first <= last

    infix fun IntRange.fullyOverlaps(other: IntRange): Boolean = first <= other.first && last >= other.last

    fun part1(input: List<String>) = input.also { println(input) }
        .map { it.asRanges() }
        .also { println(it) }
        .count {
        it.first fullyOverlaps it.second || it.second fullyOverlaps it.first
    }

    fun part2(input: List<String>) = input.map { it.asRanges() }.count { it.first overlaps it.second }

    val input = readInput("Day04")
    println(part2(input))
}