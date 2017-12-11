import java.nio.file.Files
import java.nio.file.Paths

fun main(args: Array<String>) {
    val input = Files.readAllLines(Paths.get("day2.txt"))
            .map { line -> line.split("\t").map(String::toInt) }

    val sum = input.sumBy { row -> row.max()!! - row.min()!! }

    println(sum)
}