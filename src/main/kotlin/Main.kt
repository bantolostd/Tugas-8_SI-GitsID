fun main(args: Array<String>) {
    // membuat object vaksin Sinovac
    val sinovac = Sinovac("CoronaVac", "China", 65.3)
    // menampilkan data vaksin
    sinovac.tampilkanData()
    // menampilkan anjuran peserta vaksin
    sinovac.tampilkanPeserta()

    println()

    // membuat object vaksin AstraZeneca
    val astra = AstraZeneca("AZD1222", "Inggris", 75.0)
    // menampilkan data vaksin
    astra.tampilkanData()
    // menampilkan anjuran peserta vaksin
    astra.tampilkanPeserta()
}