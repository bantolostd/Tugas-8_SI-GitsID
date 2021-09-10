// membuat class anak (Sinovac) yang mengextends superclass (Vaksin)
class Sinovac(_namaVaksin: String, _negaraAsal: String, _efikasiVaksin: Double): Vaksin(_namaVaksin, _negaraAsal, _efikasiVaksin) {
    // override method/fucntion dari super class (Vaksin)
    override fun tampilkanPeserta() {
        println("Vaksin Sinovac dianjurkan untuk usia 18–59 tahun")
    }
}