package Model;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akbar
 */
public class Kendaraan {
    private int idKendaraan;
    private String namaKendaraan;
    private String merekKendaraan;
    private String platNomor;
    private int tahunProduksi;
    private Boolean statusKetersediaan;
    private String warnaKendaraan;
    private int kapasitasKendaraan;
    private String jenisTransmisi;
    private double hargaSewa;

    public Kendaraan(int idKendaraan, String namaKendaraan, String merekKendaraan, String platNomor, int tahunProduksi, Boolean statusKetersediaan, String warnaKendaraan, int kapasitasKendaraan, String jenisTransmisi, double hargaSewa) {
        this.idKendaraan = idKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.merekKendaraan = merekKendaraan;
        this.platNomor = platNomor;
        this.tahunProduksi = tahunProduksi;
        this.statusKetersediaan = statusKetersediaan;
        this.warnaKendaraan = warnaKendaraan;
        this.kapasitasKendaraan = kapasitasKendaraan;
        this.jenisTransmisi = jenisTransmisi;
        this.hargaSewa = hargaSewa;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getMerekKendaraan() {
        return merekKendaraan;
    }

    public void setMerekKendaraan(String merekKendaraan) {
        this.merekKendaraan = merekKendaraan;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public Boolean getStatusKetersediaan() {
        return statusKetersediaan;
    }

    public void setStatusKetersediaan(Boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public int getKapasitasKendaraan() {
        return kapasitasKendaraan;
    }

    public void setKapasitasKendaraan(int kapasitasKendaraan) {
        this.kapasitasKendaraan = kapasitasKendaraan;
    }

    public String getJenisTransmisi() {
        return jenisTransmisi;
    }

    public void setJenisTransmisi(String jenisTransmisi) {
        this.jenisTransmisi = jenisTransmisi;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }
    
    public void info(){
    }
}
