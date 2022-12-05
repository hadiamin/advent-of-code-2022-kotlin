fun main() {

    fun part1(input: List<String>): Int {
        return input.map {
            rucksack -> rucksack.substring(0, rucksack.length / 2) to rucksack.substring(rucksack.length / 2)
        }
//            .also { println(it) }
            .flatMap { (first, second) -> first.toSet() intersect second.toSet() }
//            .also {
//                it.forEach { println(it.priority()) }
//            }
            .sumOf { it.priority }
    }

    fun part2(input: List<String>): Int {
        return input.chunked(3)
            .also { println(it) }
            .flatMap { (first, second, third) -> first.toSet() intersect second.toSet() intersect third.toSet() }
            .sumOf { it.priority }
    }


    val input = readInput("Day03")
    println(part2(input))
}

val Char.priority: Int
    get(): Int {
        return when (this) {
            in 'a' .. 'z' -> this - 'a' + 1
            in 'A' .. 'Z' -> this - 'A' + 27
            else -> error("Check your input")
        }
    }