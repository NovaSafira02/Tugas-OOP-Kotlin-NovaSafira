package id.infinitelearning.KotlinSubmission.exercise4


fun main() {
    processInputHarga()
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

        fun processInputHarga() {
            try {
                var hargaBuku = 3000
                var hargaPulpen= 6000
                var hargaSpidol = hargaBuku + hargaPulpen
                println("Harga Spidol Adalah : $hargaSpidol")
            } catch (e: Exception) {
                println("Terjadi Kesalahan: ${e.message}")
            } finally {
                println("Harga Spidol Berhasil di Inputkan")
            }
        }
