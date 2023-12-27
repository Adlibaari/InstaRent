package Model;
import java.util.Date;

/**
 *
 * @author nadaj
 */
public class Penyewaan {
    private int id_penyewaan;
    private Pelanggan customer;
    private Kendaraan kendaraan;
    private Pembayaran pembayaran;
    private Date mulaiSewa;
    private Date selesaiSewa;
    
    public Penyewaan(int id_penyewaan, Pelanggan customer, Kendaraan kendaraan, Pembayaran pembayaran, Date mulaiSewa, Date selesaiSewa){
        this.id_penyewaan = id_penyewaan;
        this.customer = customer;
        this.kendaraan = kendaraan;
        this.pembayaran = pembayaran;
        this.mulaiSewa = mulaiSewa;
        this.selesaiSewa = selesaiSewa;
                
    }

    public int getId_penyewaan() {
        return id_penyewaan;
    }

    public void setId_penyewaan(int id_penyewaan) {
        this.id_penyewaan = id_penyewaan;
    }

    public Pelanggan getCustomer() {
        return customer;
    }

    public void setCustomer(Pelanggan customer) {
        this.customer = customer;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public Date getMulaiSewa() {
        return mulaiSewa;
    }

    public void setMulaiSewa(Date mulaiSewa) {
        this.mulaiSewa = mulaiSewa;
    }

    public Date getSelesaiSewa() {
        return selesaiSewa;
    }

    public void setSelesaiSewa(Date selesaiSewa) {
        this.selesaiSewa = selesaiSewa;
    }
    
}

