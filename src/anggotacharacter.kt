// anggotacharacter.kt
fun main(args: Array<String>) {
    println("=== FUNGSI ANGGOTA CHARACTER ===")

    val charA: Char = 'A'
    println("Character: '$charA'")

    // Fungsi-fungsi anggota Character
    println("isUpperCase(): ${charA.isUpperCase()}")
    println("isLowerCase(): ${charA.isLowerCase()}")
    println("isDigit(): ${charA.isDigit()}")
    println("toLowerCase(): ${charA.lowercaseChar()}")

    // Konversi ke String
    val strA: String = charA.toString()
    println("toString(): \"$strA\"")
    println("Kini charA sudah menjadi String = $strA")
}