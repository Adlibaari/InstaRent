package Model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Pembayaran {
    private int id_pembayaran;
    private Date tanggalPembayaran;
    private String metodePembayaran;
    private Boolean statusPembayaran;

    public Pembayaran(int id_pembayaran, Date tanggalPembayaran, String metodePembayaran, Boolean statusPembayaran) {
        this.id_pembayaran = id_pembayaran;
        this.tanggalPembayaran = tanggalPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    public void setId_pembayaran(int id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public void setTanggalPembayaran(Date tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public void setStatusPembayaran(Boolean statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public int getId_pembayaran() {
        return id_pembayaran;
    }

    public Date getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public Boolean getStatusPembayaran() {
        return statusPembayaran;
    }

    public void infoPembayaran() {
        
    }
    
    public double hitungHargaTotal() {
        return 0;
    }
}