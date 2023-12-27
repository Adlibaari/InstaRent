package Model;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akbar
 */
public class Mobil extends Kendaraan{
    private boolean supir;

    public Mobil(boolean supir, int idKendaraan, String namaKendaraan, String merekKendaraan, String platNomor, int tahunProduksi, Boolean statusKetersediaan, String warnaKendaraan, int kapasitasKendaraan, String jenisTransmisi, double hargaSewa) {
        super(idKendaraan, namaKendaraan, merekKendaraan, platNomor, tahunProduksi, statusKetersediaan, warnaKendaraan, kapasitasKendaraan, jenisTransmisi, hargaSewa);
        this.supir = supir;
    }

    public boolean isSupir() {
        return supir;
    }

    public void setSupir(boolean supir) {
        this.supir = supir;
    }
    
    public void info(){
    }
}
