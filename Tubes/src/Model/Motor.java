package Model;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akbar
 */
public class Motor extends Kendaraan {
    private boolean helm;
    private boolean jasHujan;

    public Motor(boolean helm, boolean jasHujan, int idKendaraan, String namaKendaraan, String merekKendaraan, String platNomor, int tahunProduksi, Boolean statusKetersediaan, String warnaKendaraan, int kapasitasKendaraan, String jenisTransmisi, double hargaSewa) {
        super(idKendaraan, namaKendaraan, merekKendaraan, platNomor, tahunProduksi, statusKetersediaan, warnaKendaraan, kapasitasKendaraan, jenisTransmisi, hargaSewa);
        this.helm = helm;
        this.jasHujan = jasHujan;
    }
    
    public void info(){
    }
}
