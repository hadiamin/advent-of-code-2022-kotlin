fun main() {
    fun part1(input: List<String>): Int {
        val sumedList = mutableListOf<Int>()
        var sum = 0
        for (item in input) {
            if (item != "") {
                sum += item.toInt()
            } else {
                sumedList.add(sum)
                sum = 0
            }
        }

        return sumedList.max()
    }

    fun part2(input: List<String>): Int {
        val sumedList = mutableListOf<Int>()
        var sum = 0
        for (item in input) {
            if (item != "") {
                sum += item.toInt()
            } else {
                sumedList.add(sum)
                sum = 0
            }
        }

        return sumedList.sorted().reversed().subList(0, 3).sum()
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01.txt")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
