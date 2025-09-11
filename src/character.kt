fun main(args: Array<String>) {
    var charA: Char = 'A'
    println(charA == 'A')      // ✅ Bandingkan dengan Char
    println(charA == 65.toChar())  // ✅ Konversi Int ke Char dulu
    println(charA.code == 65)  // ✅ Ambil kode ASCII-nya lalu bandingkan
}