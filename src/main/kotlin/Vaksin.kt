open class Vaksin(_namaVaksin: String, _negaraAsal: String, _efikasiVaksin: Double) {
    // inisialisasi variabel class
    var namaVaksin = _namaVaksin
    var negaraAsal = _negaraAsal
    var efikasiVaksin = _efikasiVaksin

    // menampilkan detail data vaksin (dari parameter)
    fun tampilkanData() {
        println("Nama Vaksin\t: $namaVaksin")
        println("Negara Asal\t: $negaraAsal")
        println("Efikasi\t: $efikasiVaksin%")
    }

    // membuat method/function yang nantinya akan dioverride oleh class anak
    open fun tampilkanPeserta() {
    }
}