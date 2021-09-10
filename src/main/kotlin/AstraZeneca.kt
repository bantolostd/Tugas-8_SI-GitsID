// membuat class anak (AstraZeneca) yang mengextends superclass (Vaksin)
class AstraZeneca(_namaVaksin: String, _negaraAsal: String, _efikasiVaksin: Double): Vaksin(_namaVaksin, _negaraAsal, _efikasiVaksin) {
    // override method/fucntion dari super class (Vaksin)
    override fun tampilkanPeserta() {
        println("Vaksin AstraZeneca dianjurkan untuk usia 18–55 tahun")
    }
}