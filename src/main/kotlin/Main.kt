fun main() {
    println("Объем паралепипеда")
    print("Введите длину ")
    val length = readln()
    print("Введите ширину ")
    val width = readln()
    print("Введите высоту ")
    val height = readln()
    var result = length.toInt() * width.toInt() * height.toInt()
    print("Объем параллепипеда равен $result")
}