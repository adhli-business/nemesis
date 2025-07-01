fun main() {
    print("Nilai: ")
    val score = readLine()?.toInt() ?: 0

    val predicate: Char
    if (score >= 85 && score <= 100) {
        predicate = 'A'
    } else if (score >= 70 && score <= 84) {
        predicate = 'B'
    } else if(score >= 60 && score <= 69){
        predicate = 'C'
    } else if(score >= 50 && score <= 59){
        predicate = 'D'
    } else {
        predicate = 'E'
    }
    println("Predikat: $predicate")
}
