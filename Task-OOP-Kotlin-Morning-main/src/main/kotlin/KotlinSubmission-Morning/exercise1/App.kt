package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var firstName : String = "Nova"
    var lastName : String = "Safira"
    var age : Int = 20
    val Status : Boolean = false

    println("Nama depan saya adalah $firstName")
    println ("Nama belakang saya $lastName")
    println ("Umur saya sekarang yaitu $age tahun");
    println ("Status saya sekarang mungkin ${if (Status) "Single" else "Tidak Single"}")
}
//fun main () {
//    myProfile()
//}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID = $groupId")
    println("Member Group = $groupMember")
    println("sesi Group = $session")
    return Any()
}
//fun main() {
//    var groupId : String = " Fantastic Ten"
//    var groupMember =listOf ("Nova Safira", "Adelia Rosa", "Isep Iramansyah","Aziz Zakarsi","Muhammap Irpan","Berliyan","Ahmad Andre","Sugiharto","Akhmad Nuryasin", "Rizqi Arya Muzaki")
//    var session : String = "Morning"
//    groupDetail(groupId, groupMember, session)
//}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    var FantasticTen = listOf("Nova Safira", "Adelia Rosa", "Isep Iramansyah","Aziz Zakarsi","Muhammap Irpan","Berliyan","Ahmad Andre","Sugiharto","Akhmad Nuryasin", "Rizqi Arya Muzaki")

    return listOf(FantasticTen[0])
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("kk Ayat","kk Reza", "kk Widya")
    val countOfGroup = arrayOf<String>("Nova Safira", "Adelia Rosa", "Isep Iramansyah","Aziz Zakarsi","Muhammap Irpan","Berliyan","Ahmad Andre","Sugiharto","Akhmad Nuryasin", "Rizqi Arya Muzaki")

    val totalMentor = mentor.size
    var totalAnggota = countOfGroup.size
    var memberGroup = totalMentor + totalAnggota
    return memberGroup
}

fun main() {

    myProfile( )

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group nya berjumlah : $totalMember Orang")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Fantastic Ten", listOf("Nova Safira", "Adelia Rosa", "Isep Iramansyah","Aziz Zakarsi","Muhammap Irpan","Berliyan","Ahmad Andre","Sugiharto","Akhmad Nuryasin", "Rizqi Arya Muzaki"), "Morning")

}