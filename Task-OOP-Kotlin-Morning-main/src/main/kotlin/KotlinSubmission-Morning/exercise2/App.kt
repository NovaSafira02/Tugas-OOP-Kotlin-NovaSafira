package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini

        var bilGenap = mutableListOf<Int>()
        for (bilanganGenap in 1 .. 100){
            if (bilanganGenap % 2 == 0)
                bilGenap.add(bilanganGenap)
        }
    for (Bilangan in bilGenap){
        println("$Bilangan")
    }
    println(" ")

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
     */
    // Buat di bawah sini

     val namaBulan = mapOf("jan" to "Januari", "feb" to "Februari", "mar" to "Maret", "apr" to "April", "mei" to "Mei", "jun" to "Juni", "jul" to "Juli", "ags" to "Agustus", "sep" to "September","okt" to "Oktober", "nov" to "November",  "des" to "Desember")


    /**Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...
    */
    // Buat di bawah sini

    println ("Cetak Nama Bulan Dalam Setahun : ")
    namaBulan.forEach {(key, value)-> println("- $key -> $value")}

    /**Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini

    val month_now = "Nov"
    var birthday_month = "Mei"
    println ("It's $month_now, I was born in $birthday_month")

}