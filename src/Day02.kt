fun main() {
    fun part1(input: List<String>): Int {
        var totalScore = 0
        for (item in input) {
            when (item) {
                "A Y" -> totalScore += (2 + 6)
                "B Z" -> totalScore += (3 + 6)
                "C X" -> totalScore += (1 + 6)
                "A Z" -> totalScore += (3 + 0)
                "B X" -> totalScore += (1 + 0)
                "C Y" -> totalScore += (2 + 0)
                "A X" -> totalScore += (1 + 3)
                "B Y" -> totalScore += (2 + 3)
                "C Z" -> totalScore += (3 + 3)
            }
        }

        return totalScore
    }

    fun part2(input: List<String>): Int {
        var totalScore = 0
        for (item in input) {
            when (item) {
                "A X" -> totalScore += 3
                "B X" -> totalScore += 1
                "C X" -> totalScore += 2
                "A Y" -> totalScore += 4
                "B Y" -> totalScore += 5
                "C Y" -> totalScore += 6
                "A Z" -> totalScore += 8
                "B Z" -> totalScore += 9
                "C Z" -> totalScore += 7
            }
        }
        return  totalScore
    }
    val input = readInput("Day02")
    println(part2(input))

}