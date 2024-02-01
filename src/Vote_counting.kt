import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    var T = 0
    while (true) {
        T = scanner.nextInt()

        if (T in 1..100) {
            break
        }
    }

    val result = Array<String?>(T) { null } // T 크기의 null로 초기화된 String 배열 생성

    for (k in 0 until T) {
        var n: Int
        while (true) {
            n = scanner.nextInt()

            if (n in 1..100) {
                break
            }
        }

        // n이 5의 배수인 경우와 아닌 경우를 처리
        result[k] = if (n % 5 == 0) {
            "+".repeat(4).plus(" ").repeat(n / 5 - 1) + "++++"
        } else {
            "+".repeat(4).plus(" ").repeat(n / 5) + "|".repeat(n % 5)
        }

        println(result[k])
    }
}