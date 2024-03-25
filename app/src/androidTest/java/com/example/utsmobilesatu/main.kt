package app.src.androidTest.java.com.example.utsmobilesatu

fun main() {
    val daftarClub = listOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 6, 3, 1),
        Club("Chelsea", 6, 6, 5, 2, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0)
    )

    val daftarKlubTerurut = daftarClub.sortedByDescending { it.totalTrofi }
    val daftarKlubTanpaJuaraEropa = daftarClub.filter { it.ligaChampions == 0 && it.ligaEropa == 0 }

    // Cetak rekap perolehan trofi klub
    daftarKlubTerurut.forEach { tampilRekapPerolehanTrofi(it) }

    println()

    // Cetak rekap perolehan trofi klub
    daftarKlubTanpaJuaraEropa.forEach { tampilRekapPerolehanTrofi(it) }
}

fun tampilRekapPerolehanTrofi(club: Club) {
    println("""
      ${club.nama} berhasil meraih ${club.ligaPrimer} trofi Liga Primer Inggris, 
      ${club.fa} trofi FA, ${club.efl} trofi EFL, ${club.ligaChampions} trofi Liga Champions, 
      dan ${club.ligaEropa} trofi Liga Eropa UEFA.
  """.trimIndent())
}
