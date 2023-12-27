package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Barry
 */
public class Pelanggan extends User{
    private int idPelanggan;
    private String alamatPelanggan;
    private String teleponPelanggan;

    public Pelanggan(String username, String password, String email, int id, String alamat, String telepon) {
        super(username, password, email);
        this.idPelanggan = id;
        this.alamatPelanggan = alamat;
        this.teleponPelanggan = telepon;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public String getTeleponPelanggan() {
        return teleponPelanggan;
    }

    public void setTeleponPelanggan(String teleponPelanggan) {
        this.teleponPelanggan = teleponPelanggan;
    }
    
}
