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
    val input = readInput("Day02")
    println(part1(input))

}