package id.infinitelearning.KotlinSubmission.exercise3

fun main() {
    var nilai = 97
    var result = scoreNilai(nilai)
    println(result)
}

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    fun scoreNilai (nilai :Int) : String {
        return if (nilai >= 90) {
            "Selamat!  Anda Mendapatkan Nilai A."
        } else if (nilai in 80 .. 89) {
            "Anda Mendapatkan Nilai B."
        } else if (nilai in 70 .. 79) {
            "Anda Mendapatkan Nilai C."
        }else if (nilai in 60 .. 69) {
            "Anda Mendapatkan Nilai D."
        }else if (nilai < 60) {
            "Anda Mendapatkan Nilai E."
        }else {
            "Nilai Tidak Valid."
        }
    }
