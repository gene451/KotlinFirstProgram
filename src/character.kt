// character.kt
fun main(args: Array<String>) {
    println("=== DASAR CHARACTER DI KOTLIN ===")

    // Deklarasi dan inisialisasi Character
    var charA: Char = 'A'
    println("Character: '$charA'")

    // Contoh error (dikomentari)
    // println(charA == 65) // ⚠️ Error: Cannot compare Char and Int

    // Demonstrasi bahwa Char tidak bisa langsung sebagai Number
    println("Char tidak bisa diperlakukan langsung sebagai Number")
}