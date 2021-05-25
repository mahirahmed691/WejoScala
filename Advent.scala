import util.TextScanner

object Advent {
    def main(args: Array[String]) {
        val numbers = TextScanner.readLinesAsInts("src/inputs/day1.txt")
        println(part1(numbers))
        println(part2(numbers))
    }

    def part1(numbers: Array[Int]): Int = {
        for (i <- numbers; j <- numbers) {
            if (i + j == 2020)
                return i * j
        }
        -1
    }

    def part2(numbers: Array[Int]): Int = {
        for (i <- numbers; j <- numbers; k <- numbers) {
            if (i + j + k == 2020)
                return i * j * k
        }
        -1
    }
}